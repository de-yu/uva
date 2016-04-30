

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
public class uva108 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int data[][] = new int[a+1][a+1];
            String s = "";

            for(int i=1;i<=a;i++)
                for(int j=1;j<=a;j++)
                    data[i][j] = scanner.nextInt();
            
             for(int i=1;i<=a;i++)
                for(int j=1;j<=a;j++)
                    data[i][j] = data[i][j] + data[i-1][j];
             
             int max = 0,sum = 0;
             for(int i=1;i<=a;i++)
                 for(int j=i;j<=a;j++)
                 {
                     sum = 0;
                     for(int k=0;k<=a;k++)
                     {
                         sum = sum + data[j][k] - data[i-1][k];
                         if(sum>max)
                           max = sum;
                         if(sum<0)
                             sum = 0;
                     }
                 }
             System.out.println(max);
        }
    } 
}
