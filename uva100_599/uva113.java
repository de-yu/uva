package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva113
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
       while(scanner.hasNextDouble())
       {
           Double a = scanner.nextDouble();
           Double b = scanner.nextDouble();
           BigDecimal bd = BigDecimal.valueOf(10*(Math.pow(b, 1/a)));
           Long d = bd.longValue();
           if(d%10>=5)
               d = (d + 10L)/10;
           else
               d = d/10;
           
           System.out.println(d);
       }    
    }
}
