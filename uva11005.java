/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11005 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
      
         int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int data[] = new int[36];
            int answer[] = new int[37];
            for(int j=0;j<36;j++)
                data[j] = scanner.nextInt();
            
            int a = scanner.nextInt();
            System.out.printf("Case %d:%n",i);
            for(int j=0;j<a;j++)
            {
                int b = scanner.nextInt();
                int num,sum = 0,min = Integer.MAX_VALUE;;
                for(int k=2;k<=36;k++)
                {
                    num = b;
                    sum = 0;
                    if(num>=k)
                    while(num>=k)
                    {
                        sum = sum + data[num%k];
                        num /= k;
                        sum = sum + (k>num&&num!=0?data[num]:0);
                        //System.out.println(sum);
                    }
                    else
                        sum = data[num];
                    min = Math.min(min, sum);
                    answer[k] = sum;
                    //System.out.println(sum);
                }
                StringBuffer sb = new StringBuffer("Cheapest base(s) for number "+b+":");
                for(int k=2;k<=36;k++)
                {
                    if(answer[k]==min)
                        sb.append(" "+k);
                }
                System.out.println(sb);
                if(j==a-1&&i!=n)
                System.out.println();
            }
        }
    }
}
