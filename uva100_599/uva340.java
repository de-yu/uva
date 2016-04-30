
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva340 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
         for(int cas=1;;cas++)
         {
             int a = Integer.parseInt(br.readLine());
             if(a==0)
                 break;
             int ser[] = new int[a];
             int data[] = new int[a];
             
             String s = br.readLine();
             st = new StringTokenizer(s);
             
             int_toArray(st,ser,a);
             
             StringBuffer sb = new StringBuffer("Game "+cas+":\n");
             while(true)
             {
                 int b = 0,c = 0;
                 int input[] = new int[a];
                 boolean zero = false;
                 s = br.readLine();
                 st = new StringTokenizer(s);                 
                                 
                 int_toArray(st,input,a);
                 arrayToarray(data,ser);
                 
                 for(int i=0;i<a;i++)
                 {
                     if(input[i]==data[i])
                     {
                         b++;
                         data[i] = 10;
                         input[i] = 11;
                     }
                     if(input[i]!=0)
                         zero = true;
                 }
                 if(!zero)
                     break;

                 for(int i=0;i<a;i++)
                 {
                     for(int j=0;j<a;j++)
                     {
                         if(input[i]==data[j])
                         {
                                data[j] = 10;
                                input[i] = 11;
                                c++;
                                break;
                         }
                     }
                   
                 }
                         
                 sb.append("    "+"("+b+","+c+")\n");
             }
             System.out.print(sb);
         }
    }
    public static void int_toArray(StringTokenizer st,int data[],int a)
    {
        for(int i=0;i<a;i++)
            data[i] = Integer.parseInt(st.nextToken());
    }
    public static void arrayToarray(int change[],int data[])
    {
        for(int i=0;i<data.length;i++)
            change[i] = data[i];
    }
}
