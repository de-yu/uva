
package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00524 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           backtracking ba = new backtracking();
           int num[] = new int[a+1];
           num[1] = 1;
           if(n>1)
               System.out.println();
           System.out.println("Case "+n+":");
           ba.correct(a,2,num);
           n++;
       }
        
    }
}
class backtracking
{
     int data[] = {0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1};
     boolean boo[] = new boolean[17];     
     public void correct(int n,int time,int num[])
     {
         boo[1] = true;
         if(n==time-1)
         {
             StringBuffer sb = new StringBuffer("");
             if(data[num[1]+num[n]]==0||data[num[n]+num[n-1]]==0)
                 return;
             else{
                 
                 for(int i=1;i<=n;i++)
                 {
                     if(i==n)
                     sb.append(num[i]);   
                     else
                     sb.append(num[i]+" ");
                 }
             }        
             System.out.println(sb);
             return;
         }
         for(int i=1;i<=n;i++)
         {
             if(!boo[i])
             {
                 num[time] = i;
                 if(data[num[time]+num[time-1]]==0&&num[time-1]!=0){
                     boo[i] = false;
                     continue;
                 }
                 boo[i] = true;
                 correct(n,time+1,num);
                 boo[i] = false;
             }
         }         
     }
}
