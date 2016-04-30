

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva562 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int a = scanner.nextInt();
            int data[] = new int[a];
            int sum = 0;
            for(int i=0;i<a;i++)
            {
                data[i] = scanner.nextInt();
                sum += data[i];
            }
            int dp[] = new int[sum+1];
            dp[0] = 1;
            dp[sum] = 1;
            for(int i=0;i<a;i++)
            {
                for(int j=sum;j>=data[i];j--)
                    if(dp[j-data[i]]==1)
                        dp[j] = 1;
            }
            for(int i=sum/2;i>=0;i--)
            {
                if(dp[i]==1)
                {
                    sum = Math.abs(sum - i*2);
                    break;
                }
            }
            System.out.println(sum);
        }
    } 
}
