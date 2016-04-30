
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva568 
{
    public static void main(String[] args)throws IOException
    {
          Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BigInteger data[] = new BigInteger[10001];      
        BigInteger one = BigInteger.ONE;
        data[1] = one;
        for(Long l=2L;l<10001;l++)
        {   
            one = one.multiply(BigInteger.valueOf(l));
            data[l.intValue()] = one;
        }
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            String str = data[a].toString();
            str = str.replaceAll("0","");
            System.out.printf(" %4d -> %s\n",a,Character.toString(str.charAt(str.length()-1)));
        }
       
      
    }
}
