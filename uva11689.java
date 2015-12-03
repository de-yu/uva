

package uva2;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva11689 
{
     public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
                
            int a = scanner.nextInt();
            
            for(int i=0;i<a;i++)
            {
                               
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = b + c;
            int ans = 0;             
            do
            {
                ans = ans + e/d;
                c = e/d+e%d;
                e = c;
            }while(e>=d);
            
                System.out.println(ans);
            }
                
    }
}
