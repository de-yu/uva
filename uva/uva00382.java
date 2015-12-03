
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00382 
{
     public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder("PERFECTION OUTPUT\n");
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();                             
            int b = 0;
            if(a==0)
            {
               sb.append("END OF OUTPUT\n");
                break;
            }
            if(a==1)
            {
                sb.append("    1  DEFICIENT\n");
                continue;
            }    
            int sqrt = (int)Math.sqrt(a);
            for(int i=2;i<=sqrt;i++)
            {
                if(a%i==0)
                {
                    b = b + i + a/i;
                }
            }
            b++;
            Formatter fm = new Formatter();
            fm.format("%5d", a);
            if(b>a)
                sb.append(fm.toString()+"  ABUNDANT\n");
            else if(b<a)
                sb.append(fm.toString()+"  DEFICIENT\n");
            else
               sb.append(fm.toString()+"  PERFECT\n");      
        }
        System.out.print(sb);
    }
}
