

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11942 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder("Lumberjacks:\n");
        int data[] = new int[10];
        while(n-->0)
        {
            boolean next = true,before = true;
            for(int i=0;i<10;i++)
                data[i] = scanner.nextInt();
            
            for(int i=0,j=8;i<9;i++,j--)
            {
                if(data[i+1]<data[i])
                    next = false;
                if(data[j]<data[j+1])
                    before = false;
            }
            if(next||before)
                sb.append("Ordered\n");
            else
                sb.append("Unordered\n");
        }
        System.out.print(sb);
    }
}
