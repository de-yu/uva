
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva12149 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
        int a[] = new int[101];
        a[1] = 1;
        
        for(int i=2;i<101;i++)
            a[i] = a[i-1] + (int)Math.pow(i,2);
        
        while(scanner.hasNextInt())
        {    
            int b = scanner.nextInt();
            if(b==0)
                break;
            System.out.println(a[b]);
        }
    }        
}
