
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11388 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
      int a = scanner.nextInt();
      for(int i=0;i<a;i++)
      {
          int b = scanner.nextInt();
          int c = scanner.nextInt();
          if(c%b!=0)
              System.out.println("-1");
          else
              System.out.println(b+" "+c);
      }    
    }
}
