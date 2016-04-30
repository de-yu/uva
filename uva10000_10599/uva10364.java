/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10364 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int b = scanner.nextInt();
            int data[] = new int[b];
            boo = new boolean[b];
            int sum = 0;
            for(int i=0;i<b;i++)
            {
                data[i] = scanner.nextInt();
                sum += data[i];
            }
            Arrays.sort(data);
            if(data[b-1]>sum/4||sum%4!=0)
                System.out.println("no");
            else
            {
                edge_l = sum/4;
                ans = false;
                end = b-1;
                dfs(0,data,0);
                if(ans)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
    static int edge_l = 0;
    static boolean ans = false;
    static int end = 0;
    static boolean boo[];
    public static void dfs(int sum ,int data[],int edge_sum)
    {
        if(edge_sum==3)
        {
            ans = true;
            return;
        }
        if(sum==edge_l)
        {   
            sum = 0;
            end = data.length-1;
            dfs(sum,data,edge_sum+1);
            if(ans)
                return;
        }
        for(int i=end;i>=0;i--)
        {
            if(!boo[i]&&sum+data[i]<=edge_l)
            {
                boo[i] = true;
                end = i-1;
                dfs(sum + data[i],data,edge_sum);
                boo[i] = false;
                if(ans)
                   return;
            }
        }
    }
}
