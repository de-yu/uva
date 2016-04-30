
package uva11600_12999;

import uva10600_10999.point;
import uva600_1600.point;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11631 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        StringTokenizer st;
        
        while(true)
        {
            st = new StringTokenizer(br.readLine());
            int pointSum = Integer.parseInt(st.nextToken())
                    ,edgeSum = Integer.parseInt(st.nextToken())
                    , sum = 0;
            
            if(pointSum==0)
                break;
            
            ArrayList<point> list[] = new ArrayList[pointSum];
            for(int i=0;i<pointSum;i++)
                list[i] = new ArrayList<point>();
            
            for(int i=0;i<edgeSum;i++)
            {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken())
                        ,end = Integer.parseInt(st.nextToken())
                         , edge = Integer.parseInt(st.nextToken());
                list[start].add(new point(end , edge));
                list[end].add(new point(start , edge));
                sum += edge;
            }
            
            boolean visit[] = new boolean[pointSum];
            int dis[] = new int[pointSum];
            Arrays.fill(dis , 2147483647);
            dis[0] = 0;
            for(int i=0;i<pointSum;i++)
            {
                int toPoint = -1 , d = 2147483647;
                for(int j=0;j<pointSum;j++)
                {                  
                    if(!visit[j] && dis[j]< d)
                    {
                        toPoint = j;
                        d = dis[j];
                    }
                }
                
                if(toPoint==-1)
                     break;       
                visit[toPoint] = true;

                int size = list[toPoint].size();
                for(int j=0;j<size;j++)
                {
                    point p = list[toPoint].get(j);
                    if(!visit[p.end] && p.edge < dis[p.end])
                    {
                        dis[p.end] = p.edge;
                    }
                }
            }
            for(int i=0;i<pointSum;i++)
                sum -= dis[i];
            System.out.println(sum);
        }
    }

}
class point
{
    int end ,edge;
    public point(int a ,int b)
    {
        end = a;
        edge = b;
    }
}
