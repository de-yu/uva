
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10533 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       int prime[] = new int[1000];
       for(int i=2;i<1000;i++)
       {
           double d = Math.sqrt(i);
           boolean boo = true;
           for(int j=2;j<=d;j++)
           {
               if(i%j==0)
               {
                   boo = false;
                   break;
               }
           }
           if(boo)
               prime[i] = 1;
       }  
       int data[] = new int[1000000];
       data[2] = 1;
       for(int i=2;i<1000000;i++)
       {
           String s = Integer.toString(i);
           char c[] = s.toCharArray();
           int sum = 0;
           
           for(int j=0;j<s.length();j++)
           {
               sum += (int)c[j]-48;
           }
            if(prime(prime,i)&&prime(prime,sum))
                data[i] = 1; 
       }
       for(int i=1;i<1000000;i++)
           data[i] += data[i-1];
       
       int n = scanner.nextInt();
       StringBuilder sb = new StringBuilder("");
       while(n-->0)
       {
           int a = scanner.nextInt()
                   ,b = scanner.nextInt();
           sb.append(data[b]-data[a-1]+"\n");          
       }
       System.out.print(sb);
    }
    public static boolean prime(int prime[],int p)
    {
        boolean boo = true;
        for(int i=2;i<1000;i++)
        {
            if(i*i>p)
                break;
            if(prime[i]==1){
                if(p%i==0){
                    boo = false;
                    break;
                }
            }
        }
        return boo;
    }
}
