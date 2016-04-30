
package uva10000_10599;


import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10036 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int sumNumber = scanner.nextInt()
                    , divide = scanner.nextInt()
                        ,sum = 0;
            
            int data[] = new int[sumNumber];

            for(int i=0;i<sumNumber;i++)
            {
                data[i] = Math.abs(scanner.nextInt())%divide;

                sum += data[i];
            }

            boolean divisible = false;
            if(sum%divide!=0)
            {
                int dp[] = new int[divide];
                dp[0] = 1;

                for(int i=0;i<sumNumber;i++)
                {
                    for(int j=dp.length-1;j>=data[i];j--)
                    {
                        if(j-data[i]>=0)
                        {
                            if(dp[j-data[i]]==1)
                            {
                                dp[j] = 1;
                            }
                        }
                    }
                }

                for(int i=0;i<divide;i++)
                {
                    if(dp[i]==1 && (sum-2*i)%divide==0)
                    {
                        divisible = true;
                    }
                }
            }
            if(divisible || sum%divide==0)
                System.out.println("Divisible");
            else
                System.out.println("Not divisible");
        }
    }
}
