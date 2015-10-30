

package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11526 
{
       public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int e = scanner.nextInt();
        for(int j=0;j<e;j++)
        {
            Long a = scanner.nextLong();
            boolean boo = false;
            Long sum = 0L;
            
            for(Long i=1L;i<=a;i++)
            {
                Long c = a%i;
                Long d = a/i;             
                if(c>d)
                {
                    i = i + c/d;
                    if(i>a){
                        i = i-c/d;
                        sum = sum + (a-i);
                        i = i + c/d;
                    }
                    else{
                        sum = sum + d*(c/d+1);
                    }                   
                }
                else
                    sum = sum + d;
            }
            System.out.println(sum);
        }
    }
}
