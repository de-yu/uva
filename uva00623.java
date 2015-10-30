

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00623
{
    
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextBigInteger())
         {
             BigInteger a = scanner.nextBigInteger();
             BigInteger one = BigInteger.ONE;
             BigInteger b = a;
             BigInteger c = a;
             int d = a.intValue();
             for(int i=0;i<d-1;i++)
             {
                 b = b.add(one.negate());
                 a = a.multiply(b);
             }
             if(a.equals(BigInteger.ZERO))
             {
                              System.out.println("0!");
                                System.out.println(1);
             }
             else
             {
             System.out.println(c+"!");
             System.out.println(a);
             }
         }    
    }        
}
