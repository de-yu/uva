/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10714 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
       int a = scanner.nextInt();
       
       for(int i=0;i<a;i++)
       {
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           
           int data[] = new int[c];
           
           for(int j=0;j<c;j++)
               data[j] = scanner.nextInt();
           int max = 0;
           int max2 = 0;
           for(int j=0;j<c;j++)           
           {
               max = Math.max(max, data[j]);
               max = Math.max(max, Math.abs(b-data[j]));
               data[j] = Math.min(data[j],Math.abs(b-data[j]));
           }
           for(int j=0;j<c;j++)
               max2 = Math.max(max2,data[j]);
           
           System.out.println(max2+" "+max);
          
       }
    }
}
