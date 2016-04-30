

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10365 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int a = scanner.nextInt();
            int ans = 10000;
            double b = (int)Math.sqrt(a);
            
            for(int i=1;i<=b;i++)
            {
                for(int j=1;j<=b;j++)
                {
                    int c = i*j;
                    if(a%c==0)
                    {
                        int d = a/c;
                        ans = Math.min(ans, i*j*2 + j*d*2 + i*d*2);
                    }
                }
            }
            
            System.out.println(ans);
            
        }
    }
}
