

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10338 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
    
        int n = scanner.nextInt();
        
        for(int m=1;m<=n;m++)
        {
            String a = scanner.next();
            int alpha[] = new int[26];
            
            for(int i=0;i<a.length();i++)
                alpha[a.charAt(i)-65]++;
            
            BigInteger bi = BigInteger.ONE;
            
            for(int i=1;i<=a.length();i++)
                bi = bi.multiply(BigInteger.valueOf(i));
            
            for(int i=0;i<26;i++)
            {
                if(alpha[i]>=2)
                {
                    for(int j=2;j<=alpha[i];j++)
                        bi = bi.divide(BigInteger.valueOf(j));
                }
            }
            System.out.println("Data set "+m+": "+bi);
        }
    }
}
