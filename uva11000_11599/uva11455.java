
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11455 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int a = scanner.nextInt();
       for(int i=0;i<a;i++)
       {
           int data[] = new int[4];
           for(int j=0;j<4;j++)
               data[j] = scanner.nextInt();
           Arrays.sort(data, 0, 4);
           if(data[0]==data[1]&&data[0]==data[2]&&data[0]==data[3])
               System.out.println("square");
           else if(data[0]==data[1]&&data[2]==data[3])
               System.out.println("rectangle");
           else if(data[3]<data[0]+data[1]+data[2])
               System.out.println("quadrangle");
           else
               System.out.println("banana");
              
       }    
    }
}
