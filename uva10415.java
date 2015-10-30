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
public class uva10415 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int data[][] = {{0,0,1,1,1,0,0,1,1,1,1},{0,0,1,1,1,0,0,1,1,1,0},{0,0,1,1,1,0,0,1,1,0,0}
        ,{0,0,1,1,1,0,0,1,0,0,0},{0,0,1,1,1,0,0,0,0,0,0},{0,0,1,1,0,0,0,0,0,0,0},{0,0,1,0,0,0,0,0,0,0,0}
        ,{0,0,0,1,0,0,0,0,0,0,0},{0,1,1,1,1,0,0,1,1,1,0},{0,1,1,1,1,0,0,1,1,0,0},{0,1,1,1,1,0,0,1,0,0,0}
        ,{0,1,1,1,1,0,0,0,0,0,0},{0,1,1,1,0,0,0,0,0,0,0},{0,1,1,0,0,0,0,0,0,0,0}};
        String s[] = {"c","d","e","f","g","a","b","C","D","E","F","G","A","B"};
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0;i<14;i++)
            map.put(s[i], i);
        
        int a = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++)
        {
            int sum[] = new int[11];
            boolean finger[] = new boolean[11];
            
            String str = br.readLine();
            
            for(int j=0;j<str.length();j++)
            {
                String strchar = Character.toString(str.charAt(j));
                for(int k=0;k<11;k++)
                {
                    if(finger[k]==false&&data[map.get(strchar)][k]==1)
                    {
                        sum[k]++;
                        finger[k] = true;
                    }
                    else if(finger[k]==true&&data[map.get(strchar)][k]==0)
                        finger[k] = false;
                }
            }
            for(int k=1;k<11;k++)
            {
            	if(k==10)
                System.out.print(sum[k]);
                else
                System.out.print(sum[k]+" ");
            }
            System.out.println();
        }
 
    }
}
