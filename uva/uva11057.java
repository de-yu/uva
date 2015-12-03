
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11057 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int data[] = new int[a];
            int money;
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt();
            money = scanner.nextInt();
            
            int max = Integer.MAX_VALUE;
            int one = 0 ,two = 0;
            
            for(int i=0;i<a;i++)
            {
                for(int j=i+1;j<a;j++)
                {
                    if(data[i] + data[j] == money)
                    {
                        if(Math.abs(data[i]-data[j])<max)
                        {
                            max = Math.abs(data[i]-data[j]);
                            one = Math.min(data[i], data[j]);
                            two = Math.max(data[i], data[j]);
                        }
                    }
                }
            }
            
            System.out.printf("Peter should buy books whose prices are %d and %d.%n%n",one ,two);
        }
    }
}
