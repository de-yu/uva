
package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11015 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0)
                break;
            String name[] = new String[a+1];
            int map[][] = new int[a+1][a+1];
            for(int i=0;i<=a;i++)
                for(int j=0;j<=a;j++)
                      map[i][j] = (i==j?0:2000);
            
            for(int i=1;i<=a;i++)
                name[i] = scanner.next();
            
            for(int i=0;i<b;i++)
            {
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                int e = scanner.nextInt();
                map[c][d] = e;
                map[d][c] = e;
            }          
            for(int i=0;i<=a;i++)
                for(int j=0;j<=a;j++)
                    for(int k=0;k<=a;k++)
                        map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);

            int min = 10000;
            String ans = "";
            for(int i=1;i<=a;i++)
            {
                int sum = 0;
                for(int j=1;j<=a;j++)
                    sum = sum + map[i][j];
                if(sum<min)
                {
                    min = sum;
                    ans = name[i];
                }
            }
            System.out.printf("Case #%d : %s%n",n++,ans);
        }
    }
}
