
package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10093 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       while(scanner.hasNext())
       {
           String str = scanner.next();
           int sum = 0;
           int max = 1; 
           for(int i=0;i<str.length();i++)
           {
               int a = (int)str.charAt(i);
               if(a<=122&&a>90)
               {
                   sum = sum + a - 97 + 36;
                   max = Math.max(max,a - 97 + 36);
               }
               else if(a<=90&&a>=65)
               {
                   sum = sum + a - 65 + 10;
                   max = Math.max(max,a - 65 + 10);
               }
               else if(a>=48&&a<=57)
               {
                   sum = sum + a - 48;
                   max = Math.max(max,a - 48);
               }
           }
           boolean boo = true;
                      if(max==0)
           {
           System.out.println(2);
           boo = false;
           }
           for(int i=max;i<62;i++)
           {
               if(sum%i==0)
               {
                   System.out.println(i+1);
                   boo = false;
                   break;
               }
           }
           if(boo)
               System.out.println("such number is impossible!");
       }
    }
}
