package uva600_1600;

import java.io.*;
import java.util.*;
public class uva913 
{
 public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextLong())
       {
           Long a = scanner.nextLong();
           if(a==5L)
               System.out.println("45");
           else
               System.out.println((a+5)*(a-3)/4*6 + 15L);
       }    
    }    
}
