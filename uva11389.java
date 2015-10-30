

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11389 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a==0) break;                
            int morning[] = new int[a];
            int evening[] = new int[a];
            for(int i=0;i<a;i++) morning[i] = scanner.nextInt();
            for(int i=0;i<a;i++) evening[i] = scanner.nextInt();
            int sum = 0;
            Arrays.sort(morning);
            Arrays.sort(evening);
            
            for(int i=0;i<a;i++)
            {
                if(morning[i]+evening[a-i-1]>b)
                sum = sum + (morning[i]+evening[a-i-1]-b)*c;
            }
            System.out.println(sum);
        }
    } 
}
