
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11292 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0&&b==0)
                break;
            int dragon[] = new int[a];
            int knight[] = new int[b];
            for(int i=0;i<a;i++) dragon[i] = scanner.nextInt();
            for(int j=0;j<b;j++) knight[j] = scanner.nextInt();
            if(a>b)
            {
                System.out.println("Loowater is doomed!");
                continue;
            }
            else
            {
                int sum = 0,num = 0;
                Arrays.sort(dragon);
                Arrays.sort(knight);
                
                for(int i=0;i<b;i++)
                {
                    for(int j=0;j<a;j++)
                    {
                        if(dragon[j]<0)
                            continue;
                        if(dragon[j]>knight[i])
                            break;
                        if(knight[i]>=dragon[j])
                        {
                            sum += knight[i];
                            dragon[j] = -1;
                            num++;
                            break;
                        }
                    }
                }
                if(num!=a)
                    System.out.println("Loowater is doomed!");
                else
                    System.out.println(sum);
            }
        }
    } 
}
