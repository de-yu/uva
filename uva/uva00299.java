/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00299 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int a = Integer.parseInt(br.readLine());
        
        while(a>0)
        {
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int data[] = new int[b];
            int sum = 0;
            for(int i=0;i<b;i++)
                data[i] = Integer.parseInt(st.nextToken());
            
            for(int i=0;i<b;i++)
            {
                for(int j=i+1;j<b;j++)
                {
                    if(data[i]>data[j])
                    {
                        data[i] = data[i]^data[j];
                        data[j] = data[i]^data[j];
                        data[i] = data[i]^data[j];
                        sum++;
                    }
                }
            }
            
            System.out.printf("Optimal train swapping takes %d swaps.%n",sum);
            a--;
        }
        
    }
}
