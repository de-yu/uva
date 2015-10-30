

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10069 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            String a = scanner.next();
            String b = scanner.next();
            
            BigInteger dp[][] = new BigInteger[2][a.length()+1];
            
            int c = a.length();
            int d = b.length();
            
            for(int i=0;i<2;i++)
                for(int j=0;j<=a.length();j++)
                    dp[i][j] = BigInteger.ZERO;
            
            for(int i=0;i<d;i++)
            {
                
                for(int j=1;j<=c;j++)
                {
                    if(i==0)
                    {
                        if(a.charAt(j-1)==b.charAt(i))
                            dp[i%2][j] = dp[i%2][j-1].add(BigInteger.ONE);
                        else
                            dp[i%2][j] = dp[i%2][j-1];
                    }
                    else
                    {
                        if(a.charAt(j-1) == b.charAt(i))
                            dp[i%2][j] = dp[i%2][j-1].add(dp[(i+1)%2][j-1]);
                        else
                            dp[i%2][j] = dp[i%2][j-1];
                    }
                }
                

            }
            
            System.out.println(dp[(d+1)%2][c]);
        }
    }
}
