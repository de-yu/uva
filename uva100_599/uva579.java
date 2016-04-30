
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva579 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        StringBuffer sb = new StringBuffer("");
        while(true)
        {
            String str = br.readLine();
            if(str.equals("0:00"))
                break;
            String data[] = str.split(":");
            
            double a = Double.parseDouble(data[0])*30 + Double.parseDouble(data[1])*30/60;
            double b = Double.parseDouble(data[1])*6;
            Double angle = Math.abs(a-b);
            if(angle>180)
                angle = Math.abs(360-angle);
            
            Formatter fm = new Formatter();
            fm.format("%.3f%n",angle);
            sb.append(fm.toString());            
        }       
        System.out.print(sb);
    }   
    public static int gcd(int m, int n) 
    { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    }
}
