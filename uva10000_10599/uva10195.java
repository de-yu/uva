/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10195 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextDouble())
        {
            double a = scanner.nextDouble()
                    ,b = scanner.nextDouble()
                    ,c = scanner.nextDouble();
            
            double sum = (a+b+c)/2;
            
            double area = Math.sqrt(sum * (sum - a) * (sum - b) * (sum - c));
            
            if(sum==0)
                System.out.printf("The radius of the round table is: %.3f%n" ,0.0);
            else
                System.out.printf("The radius of the round table is: %.3f%n" , (area*2)/(sum*2));
        }
    }
}
