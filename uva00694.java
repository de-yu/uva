
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva00694 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = 1;
       while(true)
       {
           String str = br.readLine();
           StringTokenizer st = new StringTokenizer(str);
           
           long a = Long.parseLong(st.nextToken());
           long b = Long.parseLong(st.nextToken());
           if(a<0L||b<0L)
               break;
           int sum = 1;
           Long c = a;
           
           while(c!=1L&&c<=b)
           {
               if(c%2==0)
                   c = c/2;
               else
               {
                   c = c*3 + 1;
               }
               if(c>b)
                   break;
               sum++;
           }
           System.out.printf("Case %d: A = %d, limit = %d, number of terms = %d%n",n++,a,b,sum);
       }
    }
}
