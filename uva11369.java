/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11369 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
               int a = Integer.parseInt(br.readLine());      
        
        for(int j=0;j<a;j++)
        {    
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int b = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        for(int i=0;i<b;i++)
            list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        
        for(int i=list.size()-3;i>=0;i-=3)
            sum = sum + list.get(i);
        
        System.out.printf("%s%n",sum);
        }
    }      
}
