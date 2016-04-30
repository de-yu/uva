

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva264 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
             
       int data[] = new int[4500];
       data[1] = 1;
       for(int i=2;i<4500;i++)
           data[i] = (1+i)*i/2;
       
       
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int b = 0;
           for(int i=1;i<4500;i++)
           {
               if(data[i]>=a)
               {
                   b = i;
                   break;
               }
               
           }
           if(b%2==1)
           {
               int c = b;
               int d = 1;
               int e = data[b-1]+1;
               c = c - (a - e);
               d = d + (a - e);
               System.out.println("TERM "+a+" IS "+c+"/"+d);
           }
           else
           {
                int c = b;
               int d = 1;
               int e = data[b-1]+1;
               c = c + (e - a);
               d = d - (e - a);
               System.out.println("TERM "+a+" IS "+d+"/"+c);
           }
       }
    }
}
