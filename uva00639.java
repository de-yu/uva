

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00639 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextInt())
        {
            int size = scanner.nextInt();
            if(size==0)   break;
            
            int graph[][] = new int[size+2][size+2];
            boolean boo[][] = new boolean[size+2][size+2];
            String s;
            max = 0;
            for(int i=0;i<size;i++)
            {
                s = scanner.next();
                for(int j=0;j<size;j++)
                {
                    if(s.charAt(j)=='X')
                        graph[i+1][j+1] = -1;
                    else
                        graph[i+1][j+1] = 1;
                }
            }
            dfs(graph , boo , size , 0);
            System.out.println(max);
            
        }
    }
    static int x[] = {1, -1, 0, 0};
    static int y[] = {0, 0, 1, -1};
    static int max = 0;
    public static void dfs(int graph[][] , boolean boo[][] , int size , int sum)
    {
        max = Math.max(max , sum);
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(!boo[i][j]&&graph[i][j]==1)
                {
                    boo[i][j] = true;
                    boolean setpos = true;
                    
                    for(int p=0;p<4;p++)
                    {
                        int now_x = j, now_y = i;
                        while(graph[now_y+y[p]][now_x+x[p]]==1)
                        {
                            if(boo[now_y+y[p]][now_x+x[p]])
                                setpos = false;
                            now_y += y[p];
                            now_x += x[p];
                        }
                    }
                    
                    if(setpos)
                        dfs(graph , boo , size , sum+1);
                    
                    boo[i][j] = false;
                }
            }
        }
    }

}
