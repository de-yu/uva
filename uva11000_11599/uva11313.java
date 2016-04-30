package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11313 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       int a = scanner.nextInt();
       for(int i=0;i<a;i++)
       {
           int sum = scanner.nextInt();
           int c = scanner.nextInt();
           int n = 0;
           if(sum<c)
               System.out.println("cannot do this");
           while(sum>c)
           {
               n = n + sum/c;
               sum = sum/c + sum%c;
           }
           if(sum==c)
               System.out.println(n+1);
           else
               System.out.println("cannot do this");
       }    
    }
}
