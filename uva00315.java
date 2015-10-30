

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00315 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextLine())  //多組測資
        {
        while(scanner.hasNextLine())
        {
            int a = Integer.parseInt(scanner.nextLine());
            if(a==0)  break;
            
            graph = new int[a][a];
            visit = new int[a];
            grand = new int[a];
            sum = 0;
            t = 0;
            for(int i=0;i<a;i++)
            {
                String str = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(str);
                
                int p = Integer.parseInt(st.nextToken());
                if(p==0)  break;
                
                while(st.hasMoreTokens())
                {
                    int to = Integer.parseInt(st.nextToken());
                    graph[p-1][to-1] = 1;
                    graph[to-1][p-1] = 1;
                }
            }
            for(int i=0;i<a;i++)
            {
                if(visit[i]==0)
                    DFS(i,i,a);
            }
            System.out.println(sum);
        }
        }
    }
    static int graph[][];
    static int visit[];
    static int grand[];
    static int t = 0;
    static int sum = 0;
    public static void DFS(int p,int i,int a)
    {
           visit[i] = ++t;
           grand[i] = i;
 
            int child = 0;
            boolean ap = false;
 
            for (int j=0; j<a; ++j)
            {
                if (graph[i][j]>0 && j != p)
                    if (visit[j]>0)         
                    {
                        if (visit[j] < visit[grand[i]])
                            grand[i] = j;
                    }
                    else
                    {
                        child++;
                        DFS(i, j , a);              
                        
                          if (visit[grand[i]] > visit[grand[j]])
                                grand[i] = grand[j]; 
                          if (visit[grand[j]] >= visit[i])
                            ap = true;
                    }
            } 
            if (i == p && child > 1 || i != p && ap)
                sum++;
    }
}
