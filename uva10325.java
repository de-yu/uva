
package uva3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10325 
{
    static Long s;
    static Long sum;
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
     
        while(scanner.hasNextLong())
        {
            s = scanner.nextLong();
            sum = 0L;
            int a = scanner.nextInt();
            
            Long data[] = new Long[a];
            
            for(int i=0;i<a;i++)
                data[i] = scanner.nextLong();
            backtracking(0,1L,data,0);
            System.out.println(s-sum);
        }
    }
    static boolean boo[] = new boolean[16];
    public static void backtracking(int n,Long g,Long data[],int nn)
    {
        if(nn>data.length)
            return;
        for(int i=n;i<data.length;i++)
        {
            if(!boo[i])
            {
                boo[i] = true;
                Long b = gcd(g,data[i]);
                if(data[i]*g/b>2147483647)
                {
                    boo[i] = false;
                    continue;
                }
                sum = sum + (nn%2==0?s/(data[i]*g/b):-s/(data[i]*g/b));
               // System.out.println(data[i]+" "+g+" "+sum);
                backtracking(i+1,data[i]*g/b,data,nn+1);
                boo[i] = false;
            }
        }
    }
    private static Long gcd(Long m, Long n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    }
}
