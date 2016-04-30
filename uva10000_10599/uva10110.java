package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
public class uva10110
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       while(scanner.hasNextInt())
       {
          Long a = scanner.nextLong();
           if(a==0)
               break;
           Long b = (long)(int)Math.sqrt(a);
           if(b*b==a)
                System.out.println("yes");
           else
                System.out.println("no");
       }    
    } 
}
