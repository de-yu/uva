/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10268 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       while(scanner.hasNextLine())
       {
           Long a = Long.parseLong(scanner.nextLine());
           StringTokenizer st = new StringTokenizer(scanner.nextLine());
           int b = st.countTokens();
           Long data[] = new Long[b];
           
           for(int i=0;i<b;i++)
               data[i] = Long.parseLong(st.nextToken());
           
           Long sum = 0L;
           Long l = 1L,base = 1L;
           for(int i=b-2;i>=0;i--)
           {
               sum = sum + l*data[i]*base;
               l++;
               base = base * a;
           }
           System.out.println(sum);
       }
    }
}
