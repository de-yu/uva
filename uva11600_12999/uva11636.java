
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva11636 
{
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int data[] = new int[15];
        data[0] = 1;
        for(int i=1;i<15;i++)
            data[i] = data[i-1] * 2;
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a<0)
                break;
            if(a==1)
            {
                System.out.println("Case "+n+": 0");
                n++;
                continue;
            }
            for(int i=1;i<15;i++)
            {
                if(a<=data[i])
                {
                    System.out.println("Case "+n+": "+i);
                    n++;
                    break;
                }
            }    
        }    
    }    
}
