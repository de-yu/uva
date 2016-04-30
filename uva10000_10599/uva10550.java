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
public class uva10550 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            
            int angle = 1080;
            
            angle += (a-b<0?(a-b+40)*9:(a-b)*9);
            angle += (c-b<0?(c-b+40)*9:(c-b)*9);
            angle += (c-d<0?(c-d+40)*9:(c-d)*9);
            
            if(angle==1080)
                break;
            else
                System.out.println(angle);
        }
    }
}
