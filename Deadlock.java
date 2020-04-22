import java.io.*;
class Thread1 implements Runnable {
     public Object obj1;
     public Object obj2;
     public Thread1(Object obj1, Object obj2) {
           this.obj1 = obj1;
           this.obj2 = obj2;
     }

     public void run() {
           while(true) {
                synchronized (obj1) {
                     System.out.println("Thread1 : obj1");
                     synchronized (obj2) {
                           System.out.println("Thread1 : obj2");
                     }
                }
           }
     }
}

class Thread2 implements Runnable {
     public Object obj1;
     public Object obj2;
     public Thread2(Object obj1, Object obj2) {
           this.obj1 = obj1;
           this.obj2 = obj2;
     }
     public void run() {
           while(true) {
                synchronized (obj2) {
                     System.out.println("Thread2 : obj2");
                     synchronized (obj1) {
                           System.out.println("Thread2 : obj1");
                     }
                }
           }
     }
}

public class DeadLock {
     public static void main(String args[]) throws InterruptedException {
           Object obj1 = new Object();
           Object obj2 = new Object();

           Thread2 runn2 = new Thread2(obj1, obj2);
           Thread1 runn1 = new Thread1(obj1, obj2);

           Thread thrd2 = new Thread(runn2);
           Thread thrd1 = new Thread(runn1);

           thrd1.start();
           thrd2.start();

           while(!thrd2.isAlive() || !thrd1.isAlive()) {
                System.out.println("No deadlock found");
           }

     }
}
