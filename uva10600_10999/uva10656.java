
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10656 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int b;
           if(a==0)  break;
           
           StringBuilder sb = new StringBuilder("");
           boolean zero = true;
           for(int i=0;i<a;i++)
           {
               b = scanner.nextInt();
               if(b!=0) 
               {
                   zero = false;
                   sb.append(b+" ");
               }
           }
           if(zero)
               System.out.println("0");
           else
               System.out.println(sb.substring(0, sb.length()-1));          
       }
    }
}
