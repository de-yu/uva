

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10943 
{
        public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        while(scanner.hasNextLong())
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0&&b==0)  break;
            
            long c = a+b-1;
            b = b - 1;
            ArrayList<Long> list = new ArrayList<Long>();
           BigInteger sum = BigInteger.ONE;
            for(long i=c,j=1;j<=b;i--,j++)
            {
                sum = sum.multiply(BigInteger.valueOf(i));
                if(sum.mod(BigInteger.valueOf(j)).equals(BigInteger.ZERO))
                    sum = sum.divide(BigInteger.valueOf(j));
                else
                    list.add(j);
            }
            for(Long l:list)
            {
                sum = sum.divide(BigInteger.valueOf(l));
            }
            sum = sum .mod(BigInteger.valueOf(1000000));
            System.out.println(sum);
        }
    }
}
