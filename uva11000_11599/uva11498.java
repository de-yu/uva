
package uva11000_11599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11498 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();   
            if(a==0)
                break;
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            StringBuilder sb = new StringBuilder("");

            while(a-->0)
            {
                int d = scanner.nextInt();
                int e = scanner.nextInt();
                
                if(b==d||c==e)
                    sb.append("divisa");
                else if(d>b)
                {
                    if(e>c)
                        sb.append("NE");
                    else
                        sb.append("SE");
                }
                else
                {
                    if(e>c)
                        sb.append("NO");
                    else
                        sb.append("SO");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
