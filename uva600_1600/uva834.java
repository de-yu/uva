
package uva600_1600;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva834 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int gcd = gcd(a,b);
            a = a/gcd;
            b = b/gcd;
            StringBuffer sb = new StringBuffer("[" + a/b);
            
            if(a%b!=0)
            {
                sb.append(";");
                do
                {
                a = a%b;
                a = a^b;
                b = a^b;
                a = a^b;
                if(a%b==0)
                    sb.append(a/b+"]");
                else
                    sb.append(a/b+",");
                }while(a!=1&&b!=1);
            }
            else
                sb.append("]");
            
            System.out.println(sb);
        }
    }
    public static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
