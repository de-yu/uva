package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10469 
{
       public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      while(scanner.hasNextLong())
      {
          Long a = scanner.nextLong();
          Long b = scanner.nextLong();
          System.out.println(a^b);
      }
    }
}
