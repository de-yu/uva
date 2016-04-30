

package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11456 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       int a = scanner.nextInt();
       
       for(int i=0;i<a;i++)
       {
           int b = scanner.nextInt();
           if(b==0)
           {
               System.out.println(0);
               continue;
           }
           int data[] = new int[b];
           int up[] = new int[b];
           int down[] = new int[b];
           for(int j=0;j<b;j++)
           {
               data[j] = scanner.nextInt();
               up[j] = 1;
               down[j] = 1;
           }
           int max = 0;
           for(int j=b-1;j>=0;j--)
           {
               for(int k=j+1;k<b;k++)
               {
                   if(data[k]>data[j])
                       up[j] = Math.max(up[j],up[k]+1);
                   if(data[k]<data[j])
                       down[j] = Math.max(down[j],down[k]+1);
               }
           }
           for(int j=0;j<b;j++)
              max = Math.max(max, up[j]+down[j]-1);
           System.out.println(max);
       }
    }
}
