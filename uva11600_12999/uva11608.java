
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva11608 
{
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a<0)
                break;
            int data[] = new int[13];
            data[0] = a;
            for(int i=1;i<13;i++)
                data[i] = data[i-1] + scanner.nextInt();
            int inspect[] = new int[12];
            for(int i=0;i<12;i++)
                inspect[i] = scanner.nextInt();
            System.out.println("Case "+n+":");
            for(int i=0;i<12;i++)
            {
                if(data[i]>=inspect[i])
                {
                    System.out.println("No problem! :D");
                    for(int j=i;j<12;j++)
                        data[j] = data[j] - inspect[i];
                }
                else
                    System.out.println("No problem. :(");
            }
            n++;
        }    
    }    
}
