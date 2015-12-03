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
public class uva00231 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = 1;
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==-1)  break;
           ArrayList<Integer> list = new ArrayList<Integer>();
           while(a!=-1)
           {
               list.add(a);
               a = scanner.nextInt();               
           }
           int length = list.size();
           int data[] = new int[length];
           int answer[] = new int[length];
           int max = 0;
           for(int i=0;i<length;i++) 
               data[i] = list.get(i); 
           
           for(int i=length-1;i>=0;i--)
           {
               for(int j=length-1;j>i;j--)
                   if(data[i]>=data[j])
                       answer[i] = Math.max(answer[i],answer[j]+1);
           }
           for(int i=0;i<length;i++)
               max = Math.max(answer[i],max);
           if(n>1) System.out.println();
           System.out.println("Test #"+n+":");
           System.out.println("  maximum possible interceptions: "+(max+1));
           n++;
       }
    } 
}
