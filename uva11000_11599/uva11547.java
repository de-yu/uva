/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11547 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
       while(n-->0)
       {
           int a = scanner.nextInt();
           a = (a*567/9 + 7492)*235/47-498;
           
           System.out.println(Math.abs(a/10%10));
       }
    }
}
