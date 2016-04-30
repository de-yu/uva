
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva11716 
{
     public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++)
        {
            String str = scanner.nextLine();
            int b = (int)Math.sqrt(str.length());
            if(b*b!=str.length())
            {
                System.out.println("INVALID");
                continue;
            }
            else
            {
                StringBuffer sb = new StringBuffer("");
                boolean boo[] = new boolean[str.length()];
                for(int j=0;j<str.length();j++)
                {
                    if(!boo[j])
                    {
                        int n = j;
                        while(n<str.length())
                        {
                            sb.append(str.charAt(n));
                            boo[n] = true;
                            n+=b;
                        }    
                    }    
                }
                System.out.println(sb);
            }                
        }    
    }    
}
