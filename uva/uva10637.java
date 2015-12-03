
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10637 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        while(scanner.hasNextInt())
        {
            int n = scanner.nextInt();
        
            for(int i=1;i<=n;i++)
            {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                num = a;
                limit = b;  
                
                    sb = new StringBuilder("Case "+i+":\n");
                    dfs(0,1,0,"",1);
                    System.out.print(sb);
                
            }
        }
       
    }
    static int num = 0;
    static int limit = 0;    
    static StringBuilder sb;
    public static void dfs(int layer,int gcd,int sum,String str,int start)
    {
        if(sum==num&&layer==limit)
        {
            sb.append(str.substring(0,str.length()-1)+"\n");
            return;
        }
        if(layer==limit-1)
        {
            if(gcd(gcd,num-sum)==1&&start<=num-sum)
                dfs(layer+1,gcd,num,str+(num-sum)+" ",start);
            return;
        }
        for(int i=start;i<=num;i++)
        {
            if(i*(limit-layer)+sum>num)
                return;
            if(gcd(gcd,i)==1)
            {
                dfs(layer+1,gcd*i,sum+i,str+i+" ",i);
            }
        }
        
    }
     public static long gcd(long m, long n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
