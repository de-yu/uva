
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva332 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
             
        int n = 1;
        int a,b,c,d;
        while(scanner.hasNextInt())
        {
            a = scanner.nextInt();
               
            if(a==-1)
                break;
            
            String str = scanner.next();
            str = str.substring(2, str.length());
            if(a==0)
            {
                String s = "1";
                for(int i=0;i<str.length();i++)
                    s = s + "0";
                b = Integer.parseInt(str);
                c = Integer.parseInt(s);
                d = gcd(b,c);
                System.out.println("Case "+n+": "+b/d+"/"+c/d);
                n++;
                continue;
            }
            String minus = str.substring(0,str.length()-a);
            b = Integer.parseInt(str)-Integer.parseInt((minus.equals("")?"0":minus));
            String s = "";
            for(int i=0;i<a;i++)
                s = s + "9";
            for(int i=0;i<str.length()-a;i++)
                s = s + "0";
            c = Integer.parseInt(s);
            d = gcd(b,c);
            
            System.out.println("Case "+n+": "+b/d+"/"+c/d);
            n++;
            
        }
    }
      private static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
