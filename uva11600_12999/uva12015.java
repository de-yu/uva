
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva12015 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        int first = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            String b[] = new String[10];
            int c[] = new int[10];
            
            for(int j=0;j<a;j++)
            {    
                int max = 0;
                for(int i=0;i<10;i++)
                {
                    b[i] = scanner.next();
                    c[i] = scanner.nextInt();
                    if(c[i]>max)
                        max = c[i];
                }
                System.out.println("Case #"+first+":");
                for(int i=0;i<10;i++)
                {
                    if(c[i]==max)
                        System.out.println(b[i]);
                }
                first++;
            }
            first = 1;
        }    
    }        
}
