
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11078 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
      
        while(n-->0)
        {
            int a = Integer.parseInt(br.readLine());
            int before_max = -100000;
            int answer = -100000;
            
            while(a-->0)
            {
                int b = Integer.parseInt(br.readLine());
                answer = Math.max(answer , before_max - b);
                before_max = Math.max(before_max , b);
            }
            
            System.out.println(answer);
        }
    }
}
