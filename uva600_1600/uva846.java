
package uva600_1600;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva846 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long c = b - a;
            
            double d = Math.ceil(Math.sqrt(c));
            d = d*2-1;
            double e = Math.ceil((-1 + Math.ceil(Math.sqrt(c*4+1)))/2);
            e = e*2;
            
            if(c==0)    
                System.out.println(0);
            else
                System.out.println((int)Math.min(d,e));
        }
    }
}
