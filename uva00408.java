

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00408 
{
       public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(gcd(a,b)==1)
                System.out.printf("%10d%10d    Good Choice%n%n",a,b);
            else
                System.out.printf("%10d%10d    Bad Choice%n%n",a,b);
        }
    }
      public static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
