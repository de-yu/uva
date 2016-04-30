

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva495 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        BigInteger data[] = new BigInteger[5001];
        data[0] = BigInteger.ZERO;
        data[1] = BigInteger.valueOf(1L);
        
        for(int i=2;i<5001;i++)
            data[i] = data[i-1].add(data[i-2]);
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.printf("The Fibonacci number for %d is %s%n",a,data[a].toString());
        }
    }   
}
