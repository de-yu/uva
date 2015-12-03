

package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11207 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            Double max1 = 0.0;
            int max2 = 0;
            for(int i=1;i<=a;i++)
            {
                Double b = scanner.nextDouble();
                Double c = scanner.nextDouble();
                Double edge = 0.0;
                if(c>b)
                {
                    double e = b;
                    b = c;
                    c = e;
                }
                edge = c/2;                 
                   if(b/4>=c)
                   {
                       if(edge<c)
                            edge = c;                        
                   }
                   else
                   {
                       if(edge<b/4)
                           edge = b/4;                     
                   }
                   if(edge>max1)
                   {
                       max1 = edge;
                       max2 = i;
                   }
                
            }
            System.out.println(max2);
        }
    }
}
