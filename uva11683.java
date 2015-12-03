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
public class uva11683 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
       while(true)
       {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           if(a==0)
               break;
           int b = Integer.parseInt(st.nextToken());
           st = new StringTokenizer(br.readLine());
           int sum = 0;
           int before = a;
           for(int i=0;i<b;i++)
           {
               int n = Integer.parseInt(st.nextToken());
               if(before>n)
                   sum += before-n;
               before = n;
           }  
           System.out.println(sum);
       }
    } 
}
