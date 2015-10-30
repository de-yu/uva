

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10523 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            BigInteger sum = BigInteger.ZERO;
            BigInteger bi = BigInteger.valueOf(b);
            for(int i=1;i<=a;i++)
            {
                BigInteger bb = bi.pow(i);
                sum = sum.add(BigInteger.valueOf(i).multiply(bb));
            }
            System.out.println(sum);
        }
    }
}
