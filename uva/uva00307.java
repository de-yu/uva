/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00307 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n ,max ,sum;
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st;
        while((n = Integer.parseInt(br.readLine()))!=0)
        {
            int data[] = new int[n];
            max = sum = 0;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
            {
                data[i] = Integer.parseInt(st.nextToken());
                sum += data[i];
            }
            Arrays.sort(data);
            max = data[n-1];
            for(int i=max;i<=sum;i++)
            {
                boolean boo[] = new boolean[n+1];
                need = i;
                end = false;
                answer = sum/i;
                if(sum%i==0)
                {

                    dfs(data , boo , 0 ,0 , data.length-1);
                    if(end)
                    {
                        sb.append(i+"\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
    static int need , answer;
    static boolean end;
    public static void dfs(int data[] , boolean boo[] ,int length ,int sum, int start)
    {
     
       if(sum==answer)
       {
            end = true;
            return;
       }
       if(end)
           return;
       for(int i=start;i>=0;i--)
       {
           if(!boo[i]&&(length+data[i])<=need)
           {
               if(length+data[i]==need)
               {
                   boo[i] = true;
                   dfs(data , boo , 0 , sum+1 , data.length-1);
                   boo[i] = false;
                   return;
               }
               else
               {
                   boo[i] = true;
                   dfs(data , boo , length + data[i] , sum , i-1);
                   boo[i] = false;
                   if(length==0) 
                       return;
               }
               if(end)
                   return;
           }
       }
    }
}
