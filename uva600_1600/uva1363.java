
package uva600_1600;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva1363 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        while(scanner.hasNextLong())
        {
            Long a = scanner.nextLong();
            Long b = scanner.nextLong();
            boolean boo = false;
            Long sum = 0L;
            
            for(Long i=2L;i<=a;i++)
            {
                Long c = b%i;
                if(c==0)
                    continue;
                Long d = b/i; 
                if(i>b){
                    boo = true;
                     break;
                }                 
                if(c>d)
                {
                    i = i + c/d;
                    if(i>a){
                        i = i-c/d;
                        sum = sum + (c+c-(a-i)*d)*(a-i+1)/2;
                        i = i + c/d;
                    }
                    else{
                        sum = sum + (c+c%d)*(c/d+1)/2;
                    }                   
                }
                else
                    sum = sum + c;
            }
            if(boo)
                sum = sum + (a-b)*b;
            System.out.println(sum);
        }
    }
    
}
