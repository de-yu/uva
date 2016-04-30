
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva926 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       int n = scanner.nextInt();
       
       while(n-->0)
       {
           int size = scanner.nextInt();
           
           long graph[][] = new long[size+2][size+2];
           boolean visit[][] = new boolean[size+2][size+2];
           Direction dir[][] = new Direction[size+2][size+2];
           for(int i=0;i<size+2;i++)
              visit[size+1][i] = visit[i][size+1] = visit[0][i] = visit[i][0] = true;
           for(int i=0;i<size+2;i++)
               for(int j=0;j<size+2;j++) 
                   dir[i][j] = new Direction();
           
           
           Point start = new Point(scanner.nextInt() , scanner.nextInt());
           Point end = new Point(scanner.nextInt() , scanner.nextInt());
           graph[start.f][start.s] = 1;
           int dir_sum = scanner.nextInt();
           while(dir_sum-->0)
           {
               int a = scanner.nextInt();
               int b = scanner.nextInt();
               String s = scanner.next();
               dir[a][b].limit(s);
                   
                 if(s.equals("N"))
                    dir[a][b+1].limit_rev(s);
                else if(s.equals("E"))
                    dir[a+1][b].limit_rev(s);
                else if(s.equals("S"))
                    dir[a][b-1].limit_rev(s);
                else if(s.equals("W"))
                    dir[a-1][b].limit_rev(s);   
           }
           
           Queue<Point> queue = new LinkedList<Point>();
           Point dir_f[] = {new Point(0,1) , new Point(1,0)};
           String pass_dir[] = {"N" , "E"};
           queue.add(start);
           while(queue.size()!=0)
           {

               Point p = queue.poll();
               int a = p.f
                    ,b = p.s;
               if(!visit[a][b]){
                    visit[a][b] = true;
                    for(int i=0;i<2;i++)
                    {
                        int a_n = a + dir_f[i].f;
                        int b_n = b + dir_f[i].s;
                        if(!visit[a_n][b_n] && dir[a][b].incpect(pass_dir[i]))
                        {
                            queue.add(new Point(a_n,b_n));
                            graph[a_n][b_n] += graph[a][b];
                        }
                    }
               }
           }
           System.out.println(graph[end.f][end.s]); 
           }  
    }
}
class Direction
{
    int w, s, n, e;
    public Direction()
    {
        w = s = n = e = 1;
    }
    public void limit(String str)
    {
        if(str.equals("N"))
            n = 0;
        else if(str.equals("E"))
            e = 0;
        else if(str.equals("S"))
            s = 0;
        else 
            w = 0;
    }
     public void limit_rev(String str)
     {
         if(str.equals("N"))
            s = 0;
        else if(str.equals("E"))
            w = 0;
        else if(str.equals("S"))
            n = 0;
        else 
            e = 0;
     }
     public boolean incpect(String str)
     {
        boolean a = true;
        if(str.equals("N") && n==0)
            a = false;
        else if(str.equals("E") && e==0)
             a = false;
        else if(str.equals("S") && s==0)
             a = false;
        else if(str.equals("W") && w==0)
            a = false;
        
        return a;
     }
}
class Point
{
    int f , s;
    public Point(int a , int b)
    {
        f = a;
        s = b;
    }
}
