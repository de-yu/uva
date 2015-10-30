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
public class uva10066 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
       for(int c=1;;c++)
        {
          int a = scanner.nextInt();
          int b = scanner.nextInt();         
          if(a==0&&b==0)
              break;
          int data1[] = new int[a];
          int data2[] = new int[b];
          for(int i=0;i<a;i++)
              data1[i] = scanner.nextInt();
          for(int j=0;j<b;j++)
              data2[j] = scanner.nextInt();
          
            int data[][] = new int[a+1][b+1];
            
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    if(data1[i]==data2[j])
                    {
                        data[i+1][j+1] = data[i][j] + 1;
                    }
                    else
                    {
                        data[i+1][j+1] = Math.max(data[i][j+1], data[i+1][j]);
                    }
                }
            }
            System.out.println("Twin Towers #"+c);
            System.out.println("Number of Tiles : "+data[a][b]+"\n");            
        }
    }
}
