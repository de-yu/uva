
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10976 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int sum = 0;
           String s = "1/"+ a+" = ";
           StringBuilder sb = new StringBuilder("");
           
           for(int i=a+1;i<=a*2;i++)
           {
               int answer = fraction(a,i);
               if(answer!=0)
               {
                sb.append(s);
                sb.append("1/"+answer+" + 1/"+ i + "\n");
                sum++;
               }
           }
           System.out.println(sum);
           System.out.print(sb);
       }
    }
    public static int fraction(int a,int b)
    {
        int lcm = a*b/gcd(a,b);
        int c = lcm/a;
        int d = lcm/b;
        int answer = Math.abs(c-d);
        if(lcm%answer==0)
            return lcm/answer;
        else
            return 0;
    }
     public static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
