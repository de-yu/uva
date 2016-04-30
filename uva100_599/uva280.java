
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva280 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextInt())
        {
            int point_sum = scanner.nextInt();
            if(point_sum==0)
                break;
            
            int graph[][] = new int[point_sum+1][point_sum+1]; 
            while(true)
            {
                int start = scanner.nextInt();
                if(start==0)
                    break;
                while(true)
                {
                    int end = scanner.nextInt();
                    if(end==0)
                        break;
                    graph[start][end] = 1;
                }
            }
            
            int a = scanner.nextInt();
            StringBuilder sb = new StringBuilder("");
            while(a-->0)
            {
                int b = scanner.nextInt();
                ArrayList<Integer> list = new ArrayList<Integer>();
                boolean visit[] = new boolean[point_sum+1];
                Queue<Integer> queue = new LinkedList<Integer>();
                queue.add(b);
                
                while(queue.size()!=0)
                {
                    int c = queue.poll();
                    for(int i=1;i<=point_sum;i++)
                    {
                        if(graph[c][i]==1 && !visit[i])
                        {
                            queue.add(i);
                            visit[i] = true;
                        }
                    }
                }
                for(int i=1;i<=point_sum;i++)
                {
                    if(!visit[i])
                        list.add(i);
                }
                Collections.sort(list);
                
                sb.append(list.size());
                
                for(int value:list)
                {
                    sb.append(" " + value);
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }         
}
