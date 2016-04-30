/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11600_12999;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva12157 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       int a = scanner.nextInt();
       
       for(int i=1;i<=a;i++)
       {
           int b = scanner.nextInt();
           int sum1 = 0,sum2 = 0,c;
           for(int j=0;j<b;j++)
           {
               c = scanner.nextInt();
               sum1 += money(c,30)*10;
               sum2 += money(c,60)*15;
           }
           if(sum1==sum2)
               System.out.println("Case "+i+": Mile Juice "+sum1);
           else if(sum1>sum2)
               System.out.println("Case "+i+": Juice "+sum2);
           else
               System.out.println("Case "+i+": Mile "+sum1);
       }
    }
    public static int money(int m,int n)
    {
        if(m==0)
            return 0;
        else
        {
            int a = m/n;
            if(a>0)
             return a + 1;
            else
                return 1;
        }
    }
}
