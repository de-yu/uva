

package uva600_1600;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva1585 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = scanner.nextInt();
        
        while(a-->0)
        {
            String str = scanner.next();
            int sum = 0,add = 1;
            
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='X')
                    add = 1;
                else
                {
                    sum += add;
                    add++;
                }
            }
            System.out.println(sum);
        }
    }
}
