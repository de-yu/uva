

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10465 
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
            if(a>b)
            {
                a = a^b;
                b = a^b;
                a = a^b;
            }
            int min = Integer.MAX_VALUE;
            int min_de = Integer.MAX_VALUE;
            boolean boo = false;
            for(int i=0;;i++)
            {
                if((c-i*b)<0)
                    break;
                if((c-i*b)%a==0)
                {
                    System.out.println(i+(c-i*b)/a);
                    boo = true;
                    break;
                }
                else
                {
                    if((c-i*b)%a<min_de)
                    {
                        min_de = (c-i*b)%a;
                        min = i+(c-i*b)/a;
                    }
                }
            }
            if(!boo)
                System.out.println(min+" "+min_de);
        }                      
    }
}
