

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10327 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            
            int data[] = new int[a];
            int sum = 0;
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt();
            
            for(int i=0;i<a;i++)
            {
                for(int j=a-1;j>i;j--)
                {
                    if(data[j-1]>data[j])
                    {
                        sum++;
                        data[j] = data[j] ^ data[j-1];
                        data[j-1] = data[j] ^ data[j-1];
                        data[j] = data[j] ^ data[j-1];
                        
                    }
                }
            }
            
            System.out.println("Minimum exchange operations : "+sum);
        }
      
    }
}
