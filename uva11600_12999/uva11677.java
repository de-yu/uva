
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11677 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextInt())
       {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if(a==0&&b==0&&c==0&&d==0)
            break;
        if(a==c)
        {
            if(b<d)
                System.out.println(d-b);
            else if(b>d)
                System.out.println(24*60+d-b);
            else
                System.out.println(0);
        }
        else if(a<c)
        {
            if(d>b)
                System.out.println((c-a)*60+d-b);
            else if(b>d)
                System.out.println((c-a)*60-(b-d));
            else
                System.out.println((c-a)*60);
        }
        else
        {
            c = c + 24;
            if(d>b)
                System.out.println((c-a)*60+d-b);
            else if(b>d)
                System.out.println((c-a)*60-(b-d));
            else
                System.out.println((c-a)*60);
        }
       }
    }
}
