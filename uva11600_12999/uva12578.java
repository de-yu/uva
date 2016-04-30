
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva12578 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            double w = scanner.nextDouble();
            double h = w/5*3;
            double r = w/5;
            double area = r*r*Math.PI;
            System.out.printf("%.2f %.2f%n" , area , w*h-area);
        }
    }     
}
