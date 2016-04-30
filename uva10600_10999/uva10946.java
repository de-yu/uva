
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10946 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   

        int question = 1;
        while(scanner.hasNextInt())
        {
            int height = scanner.nextInt()
                    ,width = scanner.nextInt();
            if(height==0 && width==0)
                break;
            
            char graph[][] = new char[height][width];
            ArrayList<wordsum> list = new ArrayList<wordsum>();
            
            for(int i=0;i<height;i++)
            {
                String s = scanner.next();
                for(int j=0;j<width;j++)
                {
                    if(s.charAt(j) >= 65&& s.charAt(j)<=90)
                         graph[i][j] = s.charAt(j);
                    else
                        graph[i][j] = '.';
                }
            }
            
            Queue<Integer> queue_x;
            Queue<Integer> queue_y;  
            int direction[][] = {{0,1} , {0,-1} , {-1,0} , {1,0}};
            
            for(int i=0;i<height;i++)
            {
                for(int j=0;j<width;j++)
                {
                    if(graph[i][j]!='.')
                    {
                        char c = graph[i][j];
                        int sum = 0;
                        queue_x = new LinkedList<Integer>();
                        queue_y = new LinkedList<Integer>();
                        
                        queue_x.add(j);
                        queue_y.add(i);
                        while(queue_x.size()!=0)
                        {
                            int x = queue_x.poll()
                                    ,y = queue_y.poll();
                            
                            graph[y][x] = '.';
                            sum++;
                            for(int k=0;k<4;k++)
                            {
                                int new_y = y+direction[k][0]
                                    ,new_x = x+direction[k][1];

                                if(new_y>=0 && new_y<height && new_x>=0 && new_x<width)
                                {
                                    if(graph[y+direction[k][0]][x+direction[k][1]]==c)
                                    {
                                        queue_x.add(x+direction[k][1]);
                                        queue_y.add(y+direction[k][0]);
                                        graph[new_y][new_x] = '.';
                                    }
                                }

                            }
                        
                        }
                            list.add(new wordsum(c , sum));
                    }
                }
            }
            Collections.sort(list);
            
            StringBuilder sb = new StringBuilder("");
            sb.append("Problem "+question+":\n");
            for(wordsum ws:list)
            {
               sb.append(ws.out()+"\n");
            }
            System.out.print(sb);
            question++;
        }
    }
}
class wordsum implements Comparable<wordsum>
{
    char c;
    int sum;
    
    public wordsum(char a , int s)
    {
        c = a;
        sum = s;
    }
    public String out()
    {
        return c+" "+sum;
    }

    @Override
    public int compareTo(wordsum t) {
        
            if(sum < t.sum)
            {
                return 1;
            }
            else if(sum > t.sum)
            {
                return -1;
            }
            else
            {
                if(c > t.c)
                {
                    return 1;
                }
                else if(c < t.c)
                {
                    return -1;
                }
                else
                    return 0;
            }

    }
}
