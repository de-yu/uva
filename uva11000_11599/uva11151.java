
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11151 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            String s = br.readLine();
            char c[] = s.toCharArray();
            char d[] = new char[c.length];
            int length = c.length;
            int dp[][] = new int[length+1][length+1];
            for(int i=0;i<length;i++)
            {
               d[i] = c[length-i-1];
            }
           
            for(int i=1;i<=length;i++)
            {
                for(int j=1;j<=length;j++)
                {
                    if(c[i-1]==d[j-1])
                        dp[i][j] = dp[i-1][j-1] + 1;
                    else
                        dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
            
            System.out.println(dp[length][length]);
        }
    }
}
