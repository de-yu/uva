
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10499
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
       while(scanner.hasNextLong())
       {
           long a = scanner.nextLong();
           if(a<0)
                break;
           
           if(a==1L)
               System.out.println("0%");
           else{
               a = a*25;
               System.out.println(a+"%");
           }
               
       }
    }
}
