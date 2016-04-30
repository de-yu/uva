
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10330 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int c = a + 2;
            int point[] = new int[c];
            int graph[][] = new int[c][c];
            for(int i=1;i<=a;i++)
                point[i] = scanner.nextInt();
            point[0] = 10000;
            point[c-1] = 10000;
            
            int b = scanner.nextInt();
            for(int i=0;i<b;i++)
            {
                int start = scanner.nextInt()
                        ,end = scanner.nextInt()
                            ,amount = scanner.nextInt();
                graph[start][end] = Math.min(amount , point[start]);
            }
            int s_p = scanner.nextInt()
                    ,e_p = scanner.nextInt();
            for(int i=0;i<s_p;i++)
            {
                int p = scanner.nextInt();
                graph[0][p] = point[p];
            }
            for(int i=0;i<e_p;i++)
            {
                int p = scanner.nextInt();
                graph[p][c-1] = point[p];
            }

            System.out.println(BFS(graph , point , 0 , c-1));
        }
    }
    public static int BFS(int graph[][] , int point[] ,int source , int des)
    {
        int ans = 0 ,
                size = point.length ,
                    f = 0;
        int path[] = new int[size];      
        
        while(true){
            
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visit[] = new boolean[size];
        int flow[] = point.clone();
        queue.add(source);
        boolean  end = false;
        f = 0;
        
            while(queue.size()!=0)
            {
                int a = queue.poll();
                visit[a] = true;
                for(int j=1;j<size;j++)
                {
                    if(graph[a][j] > 0 && !visit[j])
                    {
                            visit[j] = true;
                            path[j] = a;
                            flow[j] = Math.min(flow[a] , graph[a][j]);
                            queue.add(j);
                            if(j==des)
                            {
                                end = true;
                                f = flow[j];   
                                
                            }
                    }
                }
                if(end)
                    break; 
            }
            if(f==0)
                break;
            ans += f ;
            for(int i=path[des] , j=des;i!=j; i = path[j=i])
            {
                graph[i][j] = graph[i][j] - f;
            }
        }
        return ans;
    }
}
