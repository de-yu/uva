
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva821 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            if(a==0&&b==0)
                break;
            
            int graph[][] = new int[101][101];
            boolean used[] = new boolean[101];
            float sum = 0f;
            int point = 0;
            for(int i=0;i<101;i++)
                for(int j=0;j<101;j++)
                    graph[i][j] = 10000;
            while(a!=0&&b!=0)
            {

                graph[a][b] = 1;
                if(!used[a]){
                    used[a] = true;
                    point++;
                }
                if(!used[b])
                {
                    used[b] = true;
                    point++;
                }      
                
                a = scanner.nextInt();
                b = scanner.nextInt();
                if(a==0 && b==0)
                     break;
            }

            for(int i=1;i<101;i++){
                for(int j=1;j<101;j++){
                    for(int k=1;k<101;k++)
                    {
                        if(used[i] && used[j] && used[k]){
                            graph[j][k] = Math.min(graph[j][k] , graph[j][i]+graph[i][k]);
                        }
                    }
                }
            }
             for(int i=1;i<101;i++){
                for(int j=1;j<101;j++){
                    if(used[i]&&used[j] && i!=j)
                        sum += graph[i][j];
                }
            }
             
            System.out.printf("Case %d: average length between pages = %.3f clicks%n", n++ , sum/(point*(point-1))); 
        }
    }
}
