
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10056 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
                int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            Double c = scanner.nextDouble();
            int d = scanner.nextInt();
            
            Double first = c*Math.pow((1-c),(d-1));
            	first = first/(1-Math.pow(1-c,b));
            	if(first.isNaN())
            		System.out.println("0.0000");
            	else
           		 System.out.printf("%.4f%n",first);
            
            
        }
    }
}
