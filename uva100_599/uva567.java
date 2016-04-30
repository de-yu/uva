
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva567 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int m = 1;
        while(scanner.hasNextInt())
        {
            int graph[][] = new int[21][21];
            
            for(int i=1;i<21;i++)
                for(int j=1;j<21;j++)
                    graph[i][j] = 10000;
            
            for(int i=1;i<20;i++)
            {
                int a = scanner.nextInt();
                
                for(int j=0;j<a;j++)
                {
                    int b = scanner.nextInt();
                    graph[i][b] = 1;
                    graph[b][i] = 1;
                }
            }
            
            for(int i=1;i<21;i++)
                for(int j=1;j<21;j++)
                    for(int k=1;k<21;k++)
                        graph[j][k] = Math.min(graph[j][k] , graph[j][i] + graph[i][k]);
                    
             int n = scanner.nextInt();
            System.out.println("Test Set #"+m);
             for(int i=0;i<n;i++)
             {
                 int a = scanner.nextInt(),
                         b = scanner.nextInt();
                 
                 System.out.printf("%2d to %2d: %d%n" , a , b , graph[a][b]);
             }
             System.out.println();
            m++;
        }
    } 
}
