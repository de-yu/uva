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
public class uva10812 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if(b-c<0||(b+c)%2!=0)
                System.out.println("impossible");
            else
                System.out.println((b+c)/2+" "+(b-c)/2);
        }
    }
}
