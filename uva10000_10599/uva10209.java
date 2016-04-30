

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10209 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNextDouble())
        {
            double a = scanner.nextDouble();
            double z = a*a-a*a*Math.PI/6-a*a*Math.sqrt(3)/4;
            double y = a*a-a*a*Math.PI/4-2*z;
            double x = a*a - 4*z -4*y;
            Formatter fm = new Formatter();
            fm.format("%.3f %.3f %.3f%n",x,4*y,4*z);
            sb.append(fm.toString());
        }
        System.out.print(sb);
    }
}
