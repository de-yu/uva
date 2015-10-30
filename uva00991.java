

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00991 
{
        public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        Long data[] = new Long[11];
        
        for(int i=1;i<11;i++)
        {
            long sum = 1;
            for(int j=2*i;j>i;j--)
                sum = sum * j;
            for(int j=2;j<=i+1;j++)
                sum = sum/j;
            data[i] = sum;
        }
        int n = 0;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(n!=0)
                System.out.println();
            System.out.println(data[a]);
            n++;
        }
    }
}
