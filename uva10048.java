
package uva4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10048 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
                    if(a==0&&b==0&&c==0)
                        break;
            int map[][] = new int[a][a]; 
            int answer[][] = new int[a][a];
            
                for(int i=0;i<a;i++)
                    for(int j=0;j<a;j++)            
                        map[i][j] = (i==j?0:1000000);
                
            for(int i=0;i<b;i++)
            {
                int start = scanner.nextInt()-1;
                int end = scanner.nextInt()-1;
                int distance = scanner.nextInt();
                map[start][end] = distance;
                map[end][start] = distance;
            }  
            
            for(int i=0;i<a;i++)
                for(int j=0;j<a;j++)
                    for(int k=0;k<a;k++)
                        map[j][k] = Math.min(map[j][k],Math.max(map[j][i],map[i][k]));
            
            if(n==1)
            System.out.printf("Case #%d%n",n++);
            else
                System.out.printf("%nCase #%d%n",n++);
            for(int i=0;i<c;i++)
            {
                int d = scanner.nextInt()-1;
                int e = scanner.nextInt()-1;
                
                if(map[d][e]==1000000)
                    System.out.println("no path");
                else
                    System.out.println(map[d][e]);
            }

            
        }
    }
    
}
