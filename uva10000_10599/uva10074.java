

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10074 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt(),b = scanner.nextInt(),max = 0;
            if(a==0&&b==0)
                break;
            int c[][] = new int[a][b];
            int data[][] = new int[a+1][b];
            
            for(int i=0;i<a;i++)
                for(int j=0;j<b;j++)
                    c[i][j] = scanner.nextInt();
            
            for(int i=1;i<=a;i++)
            {
                int m = 0;
                for(int j=0;j<b;j++)
                {
                    if(c[i-1][j]==0)
                        data[i][j] = data[i-1][j] + 1;
                    m = Math.max(data[i][j],m);
                }
                for(int j=m;j>=1;j--)
                {
                    int sum = 0;
                    for(int k=0;k<b;k++)
                    {
                        if(data[i][k]>=j)
                            sum += j;
                        else
                            sum = 0;
                        max = Math.max(sum,max);
                    }
                }
            }
            System.out.println(max);
            }   
        }
}
