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
public class uva10678 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            
            double s = Math.sqrt(c*c/4 - b*b/4);
            double l = c/2;
            
            System.out.printf("%.3f%n",Math.PI*s*l);
        }
    }
}
