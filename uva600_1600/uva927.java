
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva927 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int sumDegree = scanner.nextInt();
            int degree[] = new int[sumDegree+1];
            
            for(int i=0;i<=sumDegree;i++)
            {
                degree[i] = scanner.nextInt();
            }
            long d = scanner.nextLong()
                    ,k = scanner.nextLong();
            
  
            double temp = (Math.sqrt(d*d+8*d*k)-d)/(2*d); 
            long times = 0;
            if((temp)/(long)(temp)==1)
                times = (long)(temp);
            else
                times = (long)(temp) + 1;

            long sum = 0;
            for(int i=0;i<=sumDegree;i++)
            {
                sum += degree[i]*Math.pow(times, i);
            }
            
            System.out.println(sum);
        }
    }
}
