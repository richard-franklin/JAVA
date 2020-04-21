import java.io.*;
import java.util.*;
public class CI {

    public void calculate(int p, int t, double r, int n) {
        double a = p * Math.pow(1 + (r / n), n * t);
        double cinterest = a - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+a);
    }
    public static void main(String args[]) {
      int p,t,n;
      double r;
    	CI obj = new CI();
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the principal amount : ");
      p=s.nextInt();
      System.out.print("Enter the time the money is invested or borrowed for : ");
      t=s.nextInt();
      System.out.print("Enter the the annual interest rate : ");
      r=s.nextDouble();
      System.out.print("Enter  the number of times that interest is compounded per unit t : ");
      n=s.nextInt();
    	obj.calculate(p,t,r,n);
    }
}
