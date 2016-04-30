
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva166 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int coinValue[] = {0,5,10,20,50,100,200};
        while(scanner.hasNextInt())
        {
            int coinSum[] = new int[6];
            boolean end = true;
            int limit = 0;
            for(int i=0;i<6;i++)
            {
                coinSum[i] = scanner.nextInt();
                if(coinSum[i]!=0)
                    end = false;
                limit = limit + coinSum[i] * coinValue[i+1];
            }
            if(end)
                break;
            BigDecimal bd = scanner.nextBigDecimal().multiply(new BigDecimal("100"));
            int money = bd.intValue();
            int min = useCoin(money , coinSum , limit);
            
            System.out.printf("%3d%n" , min);
            
        }
    }
    public static int useCoin(int sum , int coinSum[] , int limit)
    {
         int coinValue[] = {0,5,10,20,50,100,200};
         int ans = 500;
         for(int pay=sum;pay<=limit && pay<=500 ;pay+=5)
         {
             int change = pay - sum;
             int coinUseSum = 0;
             int pay2 = pay;
             
             for(int j=5;j>=0;j--)
             {
                 int spendCoin = Math.min(pay2/coinValue[j+1], coinSum[j]);
                 pay2 = pay2 - spendCoin*coinValue[j+1];
                 coinUseSum += spendCoin;
             }
             if(pay2>0)
                 continue;
             for(int j=5;j>=0;j--)
             {
                 int spendCoin = change/coinValue[j+1];
                 change = change - spendCoin*coinValue[j+1];
                 coinUseSum += spendCoin;
             }      
             ans = Math.min(ans, coinUseSum);
         }

         return ans;
    }
}
