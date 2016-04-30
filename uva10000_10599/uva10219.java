
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10219 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            BigInteger sum = BigInteger.ONE;
            
            for(int i=n;i>n-k;i--)
            {
                sum = sum.multiply(BigInteger.valueOf(i));
            }
            for(int i=2;i<=k;i++)
            {
                sum = sum.divide(BigInteger.valueOf(i));
            }
            
            System.out.println(sum.toString().length());
        }
    }
}
