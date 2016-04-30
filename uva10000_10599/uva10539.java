

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10539 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num[] = new long[10000001];
        long prime[] = new long[1000001];
        int size = 0;
        for(long i=2;i<1000001;i++)
        {
            if(num[(int)i]==0)
            {
                prime[size++] = i;
                for(long j=2*i;j<1000001;j+=i)
                    num[(int)j] = 1;
            }
        }

        int n = scanner.nextInt();
        while(n-->0)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
           
            System.out.println(solve(prime , b , size) - solve(prime , a-1 , size));
        }
    }
    public static int solve(long prime[] , long limit , long size)
    {
        int answer = 0;
        for(int i=0;i<size;i++)
        {           
            long now = prime[i]*prime[i];
            
            if(now>limit)
             break;
                    
            while(now<=limit)
            {
                now *= prime[i];
                answer++;
            }
        }
        return answer;
    }
}
