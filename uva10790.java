

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10790 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0&&b==0)  break;
                
            if(a==1||b==1)
                System.out.println("Case "+n+": 0");
            else
            {
                long sum = b*(b-1)/2;
                sum = (0 + sum*(a-1))*a/2;
                System.out.println("Case "+n+": "+sum);
            }
            n++;
        }
    }
}
