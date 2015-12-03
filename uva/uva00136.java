
package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00136 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
      
        TreeSet<Long> set = new TreeSet<Long>();
        set.add(1L);
        
        for(int i=1;i<1500;i++)
        {
            Long a = set.first();
            set.add(a*2);
            set.add(a*3);
            set.add(a*5);
            set.remove(a);
        }
        System.out.println("The 1500'th ugly number is "+set.first()+".");
    }
}
