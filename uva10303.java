
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10303 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        BigInteger data[] = new BigInteger[2001];
         BigInteger answer[] = new BigInteger[1001];
        data[1] = BigInteger.ONE;
        
        for(int i=2;i<2001;i++)
            data[i] = data[i-1].multiply(BigInteger.valueOf(i));
        
        for(int i=1;i<1001;i++)
            answer[i] = data[i*2].divide(data[i]).divide(data[i+1]);
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.println(answer[a]);
        }
    }
}
