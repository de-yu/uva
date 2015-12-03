
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00438 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       while(scanner.hasNextDouble())
       {
           double x[] = new double[3];
           double y[] = new double[3];
           
           for(int i=0;i<3;i++)
           {
               x[i] = scanner.nextDouble();
               y[i] = scanner.nextDouble();
           }
           
           double length1 = distance(x[0] ,  y[0] , x[1] , y[1]);
           double length2 = distance(x[1] ,  y[1] , x[2] , y[2]);
           double length3 = distance(x[0] ,  y[0] , x[2] , y[2]);
           
           double half = (length1 + length2 + length3)/2;
           double area = Math.sqrt(half*(half-length1)*(half-length2)*(half-length3));
           double r = length1 * length2 * length3 / 4 / area;
           
           System.out.printf("%.2f%n" , 2*r*Math.PI);
       }
    }
    public static double distance(double a , double b , double c , double d)
    {
        double e = (a-c)*(a-c);
        double f = (b-d)*(b-d);
        
        return Math.sqrt(e+f);
    }
}
