import java.io.*;
import java.util.*;
public class Convert
{
    public static void main(String[] args) 
    {
        int n, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number : ");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number : "+x);
    }
}
