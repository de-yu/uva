
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva371 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long a,b,d,e = 0,max = 0,max_n = 0;
        
        StringBuilder sb = new StringBuilder("");
        
        while(scanner.hasNextLong())
        {
            a = scanner.nextLong();
            b = scanner.nextLong();
            if(a==0&&b==0)  break;
            long a1 = a,b1 = b;
            max = max_n = 0;
            if(a>b) 
            {
                    a = a^b;  //互換
                    b = a^b;
                    a = a^b;
            }
            for(long i=a;i<=b;i++)
            {
                d = 0;
                e = i;
                while(e!=1)
                {
                    if(e%2==0)
                        e = e/2;
                    else
                        e = 3*e+1;
                    d++;
                }
                if(i==1)
                    d = 3;
                if(d>max){
                max = d;  
                max_n = i;
                }
            }
            sb.append("Between "+a+" and "+b+", "+max_n+" generates the longest sequence of "+max+" values.\n");
        }     
         System.out.print(sb);   
            
            
        
    }
}
