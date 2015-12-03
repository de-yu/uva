
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10025 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a = Math.abs(scanner.nextInt());

            int b = (-1+(int)Math.sqrt(1+a*8))/2;
            int sum = (b+1)*b/2;
            
            while(!(sum>=a&&(sum-a)%2==0))
            {
                b++;
                sum = sum + b; 
            }
            if(i!=0)
                System.out.println();
            if(a==0)
                System.out.println("3");
            else
                System.out.println(b);
        }
    }
}
