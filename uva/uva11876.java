
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11876 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int data[] = new int[1000001];
        data[1] = 1;
        data[2] = 1;
        
        int a = 2;
        while(a<=1000001)
        {
            data[a] = 1;
            a = a + divisors(a);
        }  
        for(int i=2;i<1000001;i++)
            data[i] = data[i-1] + data[i];
        
        int n = Integer.parseInt(br.readLine());
        int b , c;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        for(int i=1;i<=n;i++)
        {
            st = new StringTokenizer(br.readLine());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            
            sb.append("Case "+i+": "+(data[c]-data[b-1])+"\n");
        }
        System.out.print(sb);
    }
    public static int divisors(int a)
    {
        int sum = 0;
        double sqrt = Math.sqrt(a);
        for(int i=1;i<=sqrt;i++)
        {
            if(a%i==0)
                sum += 2;
        }
        if((int)sqrt*(int)sqrt==a)
            sum--;
        
        return sum;
    }
}
