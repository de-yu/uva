
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10684 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            int data[] = new int[a];
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt();
            
            int sum = 0;
            int max = -1;
            for(int i=0;i<a;i++)
            {
                sum = sum + data[i];
                if(sum<0)
                    sum = 0;
                if(sum>max)
                    max = sum;
            }
            if(max==0)
                System.out.println("Losing streak.");
            else              
                System.out.println("The maximum winning streak is "+max+".");
        }
    }
}
