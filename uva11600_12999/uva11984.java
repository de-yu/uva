
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11984 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            double a = scanner.nextDouble()
                    ,b = scanner.nextDouble();
            
            b = b *5/9;
            a = a + b;
            
            System.out.printf("Case %d: %.2f%n" , i , a);
        }
    }
}
