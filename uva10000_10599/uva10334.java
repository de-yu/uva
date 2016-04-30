
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10334 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        BigInteger bi[] = new BigInteger[1001];
        bi[0] = BigInteger.ONE;
        bi[1] = BigInteger.valueOf(2);
        
        for(int i=2;i<1001;i++)
            bi[i] = bi[i-1].add(bi[i-2]);
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.println(bi[a]);
        }
    }
}
