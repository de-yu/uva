/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11600_12999;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva12068 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int a = scanner.nextInt();
            long data[] = new long[a];
            long lcm = 1L,sum = 0L;
            for(int j=0;j<a;j++)
            {
                data[j] = scanner.nextLong();
                lcm = lcm*data[j]/gcd(lcm,data[j]);
            }
            for(int j=0;j<a;j++)
                sum += lcm/data[j];
            
            long gcd = gcd(lcm*a,sum);
            System.out.println("Case "+i+": "+lcm*a/gcd+"/"+sum/gcd);
        }
    }
     public static long gcd(long m, long n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
