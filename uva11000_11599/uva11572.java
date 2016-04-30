/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11000_11599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11572 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++)
        {
            int b = Integer.parseInt(br.readLine());
            int data[] = new int[b];
            
            for(int j=0;j<b;j++)
                data[j] = Integer.parseInt(br.readLine());
            
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int head = 0,sum = 0,max = 0;
            for(int j=0;j<b;j++)
            {
                if(map.get(data[j])==null)
                {
                    map.put(data[j], j);
                    sum++;
                }
                else
                {
                    if(map.get(data[j])<head)
                    {
                        map.put(data[j], j);
                        sum++;
                    }
                    else
                    {
                        sum = j-map.get(data[j]);
                        head = map.get(data[j])+1;
                        map.put(data[j],j);
                    }
                }  
                max = Math.max(max, sum);
            }
            System.out.println(max);
        }
    }
}
