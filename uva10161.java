
package uva5;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10161 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            int b = (int)Math.ceil(Math.sqrt(a));
            int c = b,d = b;
            if(b%2==0)
            {
                if(a>b*b-(b-1))
                    d = d - (a-(b*b-(b-1)));
                else
                    c = c - ((b*b-(b-1)-a));
            }
            else
            {
                 if(a>b*b-(b-1))
                    c = c - (a-(b*b-(b-1)));
                else
                    d = d - ((b*b-(b-1)-a));
            }
            System.out.println(c+" "+d);
        }
    }
}
