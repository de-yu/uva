

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10424 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextLine())
        {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            a = a.toLowerCase();
            b = b.toLowerCase();
            int c = 0,d = 0;       
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)<=122&&a.charAt(i)>=97)
                    c = c + (int)a.charAt(i)-96;
            }
            for(int i=0;i<b.length();i++)
            {
                if(b.charAt(i)<=122&&b.charAt(i)>=97)
                    d = d + (int)b.charAt(i)-96;
            }
            Double f = math(c);
            Double g = math(d);
            
            Double e = Math.min(f, g)/Math.max(f, g)*100;
            if(e.isNaN()||e>100)
                continue;
            System.out.printf("%.2f",e);
            System.out.println(" %");
        }
    }
    public static double math(int c)
    {
        while(c>=10)
        {
                int e = 0;
                while(c>0)
                {
                    e = e + (int)c%10;
                    c = c/10;
                }
                c = e;
        }
        return c;
    }
}
