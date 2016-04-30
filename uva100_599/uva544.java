
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva544 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n =1;
        StringBuilder sb = new StringBuilder("");
        while(scanner.hasNextInt())
        {
            int pointSum = scanner.nextInt()
                    ,edgeSum = scanner.nextInt();
            if(pointSum==0)
                break;
            
            HashMap<String ,Integer> posToNum = new HashMap<String , Integer>();
            int graph[][] = new int[pointSum][pointSum];
            int posIndex = 0 , ans = 0;
            
            for(int i=0;i<edgeSum;i++)
            {
                String startPos = scanner.next()
                        ,endPos = scanner.next();
                
                if(posToNum.get(startPos)==null)
                {
                    posToNum.put(startPos, posIndex);
                    posIndex++;
                }
                if(posToNum.get(endPos)==null)
                {
                    posToNum.put(endPos, posIndex);
                    posIndex++;
                }
                graph[posToNum.get(startPos)][posToNum.get(endPos)] = scanner.nextInt();
                graph[posToNum.get(endPos)][posToNum.get(startPos)] = graph[posToNum.get(startPos)][posToNum.get(endPos)];
            }
            int startPoint = posToNum.get(scanner.next())
                    ,endPoint = posToNum.get(scanner.next());
            
            boolean visit[] = new boolean[pointSum];
            int dis[] = new int[pointSum];
            int backPos[] = new int[pointSum];
            Arrays.fill(dis ,0);
            dis[startPoint] = 10001;
            for(int i=0;i<pointSum;i++)
            {
                int toPoint = -1 , d = 0;
                for(int j=0;j<pointSum;j++)
                {                  
                    if(!visit[j] && dis[j]> d)
                    {
                        toPoint = j;
                        d = dis[j];
                    }
                }
                
                if(toPoint==-1)
                     break;       
                visit[toPoint] = true;
                
                for(int j=0;j<pointSum;j++)
                {  
                    if(!visit[j] && graph[toPoint][j] > dis[j])
                    {
                        dis[j] = graph[toPoint][j];
                        backPos[j] = toPoint;
                        dis[j] = Math.min(dis[j] , dis[backPos[j]]);
                    }
                }
            }

            ans = dis[endPoint];
            sb.append("Scenario #"+n+"\n");
            sb.append(ans+" tons\n\n");
            n++;
        }
        System.out.print(sb);
    }
}
