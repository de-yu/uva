
package uva11600_12999;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva12279 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = 1;
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==0)
               break;
           int sum = 0;
           
           for(int i=0;i<a;i++)
           {
               int b = scanner.nextInt();
               if(b!=0)
                   sum++;
               else
                   sum--;
           }
           System.out.println("Case "+n+": "+sum);
           n++;
       }
    }
}
