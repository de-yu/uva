
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva624 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextInt())
        {
            int capacity = scanner.nextInt();
            int n = scanner.nextInt();
            int data[] = new int[n];
            for(int i=0;i<n;i++)
                data[i] = scanner.nextInt();
            Backtrack bb = new Backtrack();
            bb.capacity = capacity;
            bb.permutation(data,"", 0, 0);
            bb.out();
        }
    } 
}
 class Backtrack
{
    boolean use[] = new boolean[20]; 
    StringBuilder sb = new StringBuilder("");
    int ans = 0;
    int capacity;
    public void permutation(int data[],String answer,int sum,int n)
    {       

            if(sum>=ans&&sum<=capacity)
            {
                if(sum>ans)
                    sb = new StringBuilder(answer);
                ans = sum;
                if(answer.length()>sb.length())
                    sb = new StringBuilder(answer);
            }

        for(int i=n;i<data.length;i++)
        {
            if(!use[i])
            {
                use[i] = true;
                permutation(data,answer+data[i]+" ",sum+data[i],i+1);
                use[i] = false;
            }    
        }    
    }
    public void out()
    {
        System.out.println(sb + "sum:"+ans);
    }
 }
