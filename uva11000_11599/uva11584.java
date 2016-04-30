
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11584
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int a = Integer.parseInt(br.readLine());
        
        while(a-->0)
        {
            String s = br.readLine();
            int dp[] = new int[s.length()+1];
            
            for(int i=1;i<=s.length();i++)
            {
                dp[i] = i;
                for(int j=1;j<=i;j++)
                if(yes(s,j-1,i-1))
                    dp[i] = Math.min(dp[i],dp[j-1] + 1);
            }
            System.out.println(dp[s.length()]);
        }       
    }
    public static boolean yes(String s,int i,int j)
    {
        boolean boo = true;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                boo = false;
                break;
            }
            i++;
            j--;
        }
        return boo;
    }
}
