
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11417 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       GCD g = new GCD();
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int sum = a - 1;
           if(a==0)
               break;
           
           for(int i=2;i<a;i++)
           {
               for(int j=i+1;j<=a;j++)
                   sum = sum + g.answer(i,j);
           }
           System.out.println(sum);
       }           
    }
}
class GCD
{
    public int answer(int a,int b)
    {
        BigInteger c = BigInteger.valueOf((long)a);
        BigInteger d = BigInteger.valueOf((long)b);
        return c.gcd(d).intValue();
    }        
}

