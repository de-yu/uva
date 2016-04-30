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
public class uva10360 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        
        for(int m=0;m<n;m++)
        {
            int data[][] = new int[1025][1025];
            int d = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st;
            while(num-->0)
            {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
                for(int i=a-d;i<=a+d;i++)
                {
                    for(int j=b-d;j<=b+d;j++)
                    {
                        if(i<0||i>1024||j<0||j>1024)
                            continue;
                        data[i][j]+=c;
                    }
                }
            }
            int max_x = 0,max_y = 0;
            int max = 0;
            
            for(int i=0;i<1025;i++)
                for(int j=0;j<1025;j++)
                    if(data[i][j]>max)
                    {
                        max = data[i][j];
                        max_x = j;
                        max_y = i;
                    }
            System.out.println(max_y+" "+max_x+" "+max);    
        }
    } 
}
