
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10608 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(n-->0)
        {
            st = new StringTokenizer(br.readLine());
            int peopleSum = Integer.parseInt(st.nextToken()),
                    inputSum = Integer.parseInt(st.nextToken());
            
            int group[] = new int[peopleSum+1];
            int sum[] = new int[peopleSum+1];
            int max = 0;
            
            Arrays.fill(sum , 1);
            for(int i=1;i<peopleSum+1;i++)
                group[i] = i;
            
            for(int i=0;i<inputSum;i++)
            {
                st = new StringTokenizer(br.readLine());
                int friend1 = Integer.parseInt(st.nextToken())
                        ,friend2 = Integer.parseInt(st.nextToken());
                
                union(friend1 , friend2 , group , sum ,max);
                
               //for(int j=1;j<peopleSum+1;j++)
               // System.out.println(group[j]+" "+sum[j]);
                //System.out.println();
            }
             for(int j=1;j<peopleSum+1;j++)
                 max = Math.max(max,sum[j]);
            System.out.println(max);
        }
    }
    public static int find(int num , int group[])
    {
        if(num==group[num])
            return num;
        group[num] = find(group[num] , group);
        return group[num];
    }
    public static void union(int x , int y , int group[] , int sum[] , int max)
    {
        int f = find(x , group);
        int s = find(y , group);
        if(f!=s){
         group[f] = y;
         sum[s] += sum[f];
         sum[f] = 0;
        }
    }
}
