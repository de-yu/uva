
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva573 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        while(scanner.hasNextDouble())
        {
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();
            Double c = scanner.nextDouble();
            Double d = scanner.nextDouble();
            if(a==0)
                break;
            d = (b*d)/100;
            Double e = a;
            for(int i=1;;i++)
            {
                a = a - (b>0?b:0);
                if(a<0)
                {
                    System.out.printf("success on day %d%n",i);
                    break;
                }
               
                b = b - d;
                a = a + c;
                if(a>e)
                {
                    System.out.printf("failure on day %d%n",i);
                    break;
                }
            }
        }
    }
}
