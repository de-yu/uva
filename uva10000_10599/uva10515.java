
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10515 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextBigInteger())
        {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            
            if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO))
                break;
            
            a = a.mod(BigInteger.TEN);
            int circle = 2;
            
            while(!a.pow(circle).mod(BigInteger.TEN).equals(a))
            {
                circle++;
            }
            
            b = b.mod(BigInteger.valueOf(circle-1));
            a = a.pow(b.intValue()+circle-1);
            String s = a.toString();
            System.out.println(s.charAt(s.length()-1));    
        }
    }         
}
