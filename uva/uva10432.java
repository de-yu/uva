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
public class uva10432 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        while(scanner.hasNextDouble())
        {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = 360/b/(180/Math.PI);
            System.out.printf("%.3f%n",a*a*Math.sin(c)*b/2);
        }
    }
}
