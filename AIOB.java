import java.util.Arrays;
import java.util.Scanner;

public class AIOB {
   public static void main(String args[]) {
      int[] a = {897, 56, 78, 90, 12, 123, 75};
      System.out.println("Elements in the array are:: ");
      System.out.println(Arrays.toString(a));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element : ");
      try {
         int element = sc.nextInt();
         System.out.println("Element in the given index is : "+a[element]);
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("The index you have entered is invalid");
      }
   }
}
