
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11185 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a<0)
            break;
           else
            System.out.println(Integer.toString(a, 3));
       }    
    }         
}
