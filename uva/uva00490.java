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
public class uva00490 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
     int n = 0;
         char c[][] = new char[101][101];
         int max = 0;
         while(scanner.hasNextLine())
         {
             String str = scanner.nextLine();
             if(str.length()>max)
                 max = str.length();
             if(str.equals("EOF"))
                 break;
             for(int i=0;i<str.length();i++)
                 c[n][i] = str.charAt(i);
             n++;
         }    
         for(int j=0;j<max;j++)
         {
             for(int i=n-1;i>=0;i--)
             {
                 if(c[i][j]=='\0')
                 System.out.print(" ");
                 else
                 System.out.print(c[i][j]);
             }
             System.out.println();
         }    
    } 
}
