
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10000 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int m = 1 , p = 0;
        Formatter fm = new Formatter();
        while((p = Integer.parseInt(br.readLine()))!=0)
        {
            int start = Integer.parseInt(br.readLine());
            
            int graph[][] = new int[p+1][p+1];
            int point[] = new int[p+1];
            boolean inqueue[] = new boolean[p+1];
            int max = 0 , end = 1;
            Queue<Integer> queue = new LinkedList<Integer>();
            
            for(;;)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken())
                        ,b = Integer.parseInt(st.nextToken());
                if(a==0&&b==0)
                    break;
                graph[a][b] = 1;
            }
            
            queue.add(start);
            
            while(queue.size()!=0)
            {
                int s = queue.poll();
                int n = point[s];

                inqueue[s] = false;
                for(int i=1;i<p+1;i++)
                {
                    if(graph[s][i]==1&&n+1>point[i]) 
                    {
                        point[i] = n + 1;
                        if(!inqueue[i])
                        {
                            queue.add(i);
                            inqueue[i] = true;
                        }
                    }
                }                
            }
            for(int i=1;i<p+1;i++)
            {
                if(point[i]>max)
                {
                    max = point[i];
                    end = i;
                }
            }
            fm.format("Case %d: The longest path from %d has length %d, finishing at %d.%n%n" , m++ , start , max , end);
        }
        System.out.print(fm.toString());
    }
    
}
