
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10116 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextInt())
        {
            int h = scanner.nextInt(),
                    w = scanner.nextInt(),
                        start_x = scanner.nextInt();
            if(h==0)
                break;
            
            char graph[][] = new char[h+2][w+2];
            boolean visit[][] = new boolean[h+2][w+2];
            int step[][] = new int[h+2][w+2];
            for(int i=0;i<h;i++)
            {
                String s = scanner.next();
                for(int j=0;j<w;j++)
                    graph[i+1][j+1] = s.charAt(j);       
            }
            
            int start_y = 1 , sum = 0;
            StringBuilder sb = new StringBuilder("");
            
            while(true)
            {
                if(visit[start_y][start_x])
                {
                    sb.append(step[start_y][start_x]+" step(s) before a loop of "+(sum-step[start_y][start_x])+" step(s)");
                    break;
                }
                if((int)graph[start_y][start_x]==0)
                {
                    sb.append(sum+" step(s) to exit");
                    break;
                }
                visit[start_y][start_x] = true;
                step[start_y][start_x] = sum;
                
                if(graph[start_y][start_x]=='N')
                    start_y--;
                else if(graph[start_y][start_x]=='S')
                    start_y++;
                else if(graph[start_y][start_x]=='E')
                    start_x++;
                else
                    start_x--;
                sum++;
            }  
            System.out.println(sb);       
        }
    }
}
