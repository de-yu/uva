
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11152 
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
            double s = a+b+c;
            double area = Math.sqrt(s/2*(s/2-a)*(s/2-b)*(s/2-c));
            double outr = (a*b*c)/(4*area)
                    ,inr = (2*area)/s;
            outr = outr * outr * Math.PI;
            inr = inr * inr * Math.PI;
            
            System.out.printf("%.4f %.4f %.4f%n" , outr-area , area - inr , inr);
        }
    }
}
