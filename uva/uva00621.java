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
public class uva00621 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int a = scanner.nextInt();
        
        while(a-->0)
        {
            String str = scanner.next();
            int length = str.length();
            if(str.equals("1")||str.equals("4")||str.equals("78"))
                System.out.println("+");
            else if(str.substring(length-2,length).equals("35"))
                System.out.println("-");
            else if(length>3)
            {
                if(str.substring(0, 3).equals("190"))
                   System.out.println("?");
                else if(str.charAt(0)=='9'&&str.charAt(length-1)=='4')
                System.out.println("*");
            }
            else if(str.charAt(0)=='9'&&str.charAt(length-1)=='4')
                System.out.println("*");
        }
    }
}
