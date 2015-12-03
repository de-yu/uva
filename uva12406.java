import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva12406 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       TreeSet<Long> data[] = new TreeSet[17];
       for(int i=0;i<17;i++)
           data[i] = new TreeSet<Long>();
       data[0].add(1L);
       data[0].add(2L);
       for(int i=1;i<17;i++)
       {
           for(Long l:data[i-1])
           {
               data[i].add(l*10+1);
               data[i].add(l*10+2);
           }
       }
       int a = scanner.nextInt();
       for(int i=1;i<=a;i++)
       {
           int b = scanner.nextInt();
           int c = scanner.nextInt();
           c = (int)Math.pow(2, c);
           Long min = Long.MAX_VALUE;
           Long max = 0L;
           int d = 0;
           for(Long l:data[b-1])
           {
               if(l%c==0)
               {
                   max = l;
                   if(d==0){
                       min = l;
                       d = 1;
                   }
               }    
           }
           if(max==min)
               System.out.println("Case "+i+": "+max);
           else if(d==0)
               System.out.println("Case "+i+": impossible");
           else
               System.out.println("Case "+i+": "+min+" "+max);
               
       }    
    }
}
