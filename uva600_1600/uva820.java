
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva820 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = 1 , a = 1;

        while((a = Integer.parseInt(br.readLine()))!=0)
        {
            int graph[][] = new int[a+1][a+1];
            
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int source = Integer.parseInt(st.nextToken()),
                    des = Integer.parseInt(st.nextToken()),
                     edge = Integer.parseInt(st.nextToken());
            for(int i=0;i<edge;i++)
            {
                s = br.readLine();
                st = new StringTokenizer(s); 
                int start = Integer.parseInt(st.nextToken()),
                         end = Integer.parseInt(st.nextToken()),
                            amount = Integer.parseInt(st.nextToken());
                graph[start][end] += amount;
                graph[end][start] += amount;
            }
            System.out.println("Network "+n);
            System.out.println("The bandwidth is "+BFS(graph , source , des , a+1)+".\n");
            n++;
        }
    }
    public static int BFS(int graph[][] ,int source , int des , int size)
    {
        int ans = 0 ,
                    f = 0;
        int path[] = new int[size];  
        int bottleneck[] = new int[size];
       
        while(true){
            
        Arrays.fill(bottleneck, 0);
        bottleneck[source] = 10000;
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visit[] = new boolean[size];
        queue.add(source);
        boolean  end = false;
        f = 10000;
        
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
                            bottleneck[j] = Math.min(bottleneck[a] , graph[a][j]);
                            queue.add(j);
                            if(j==des)
                            {
                                end = true;
                                f = bottleneck[j];
                            }
                    }
                }
                if(end)
                    break; 
            }
            
            if(bottleneck[des]==0)
                break;

                ans += f;
            
            for(int i=path[des] , j=des;i!=j; i = path[j=i])
            {
                graph[i][j] -= f;
                graph[j][i] -= f;
            }
        }
        return ans;
    }
}
