
package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11063 
{
   public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       int n = 1;
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           HashSet<Integer> set = new HashSet<Integer>();
           int data[] = new int[a];
           boolean zero = false;
           for(int i=0;i<a;i++)
           {
               data[i] = scanner.nextInt();
               if(data[i]<1)
                   zero = true;
               if(i>0)
               {
                   if(data[i]<data[i-1])
                       zero = true;
               }
           }
           if(zero)
           {
               System.out.printf("Case #%d: It is not a B2-Sequence.%n%n",n++);
               continue;
           }
           for(int i=0;i<a;i++)
               for(int j=i;j<a;j++)
                   set.add(data[i]+data[j]);
           
           if(set.size()!=a*(a-1)/2+a)
               System.out.printf("Case #%d: It is not a B2-Sequence.%n%n",n++);
           else
               System.out.printf("Case #%d: It is a B2-Sequence.%n%n",n++);
       }    
    }        
}
