
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10130 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int a = scanner.nextInt();
            int price[] = new int[a];
            int weight[] = new int[a];
            int dp[] = new int[31];
            for(int i=0;i<a;i++)
            {
                price[i] = scanner.nextInt();
                weight[i] = scanner.nextInt();
            }
            for(int i=0;i<a;i++)
            {
                for(int j=30;j>=weight[i];j--)
                {
                    if(dp[j-weight[i]]>0||j-weight[i]==0)
                        dp[j] = Math.max(dp[j],dp[j-weight[i]] + price[i]);
                }
            }
           for(int i=1;i<31;i++)
                dp[i] = Math.max(dp[i],dp[i-1]);
            int b = scanner.nextInt();
            int sum = 0;
            for(int i=0;i<b;i++)
                sum += dp[scanner.nextInt()];
            System.out.println(sum);
        }
    } 
}
