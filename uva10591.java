
package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10591 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int a = scanner.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            int b = scanner.nextInt();
            int c = b;
            boolean yes = false;
            for(int j=0;j<500;j++)
            {
                b = sum(b);
                if(b==1)
                {
                    yes = true;
                    break;
                }
            }
            if(yes)
                System.out.printf("Case #%d: %d is a Happy number.%n",i,c);
            else
                System.out.printf("Case #%d: %d is an Unhappy number.%n",i,c);
        }
    }
    public static int sum(int n)
    {
        int s = 0;
        
        while(n!=0)
        {
            s = s + (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }
}
