

package uva100_599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva201 
{
   public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            connect graph[][] = new connect[a+2][a+2];
            for(int i =0;i<a+2;i++)
                for(int j=0;j<a+2;j++)
                    graph[i][j] = new connect();
            for(int i=0;i<b;i++)
            {
                String s = scanner.next();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                if(s.equals("V"))
                {
                    graph[d][c].down = true;
                    graph[d+1][c].up = true;
                }
                else
                {
                    graph[c][d].right = true;
                    graph[c][d+1].left = true;         
                }
            }
            if(n>1)
                sb.append("\n**********************************\n\n");
            sb.append("Problem #" + n + "\n\n");
            square s = new square();
            for(int j=1;j<a;j++)
            {
                sb.append(s.sum_square(j, a, graph));
            }
            if(!s.anysquare)
                sb.append("No completed squares can be found.\n");
            n++;
        }
        System.out.print(sb);
    } 
}
class connect
{
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
}
class square
{
    int sum = 0;
    boolean anysquare = false;
    
    public String sum_square(int size,int max,connect graph[][])
    {
        sum = 0;
        for(int i=1;i<=max-size;i++)
        {
            for(int j=1;j<=max-size;j++)
            {
                if(edge(size,graph,i,j))
                    sum++;
            }
        }
        if(sum>0)
            anysquare = true;
        if(sum>0)
            return (sum+" square (s) of size "+size+"\n");
        else
            return "";
    }
    public boolean edge(int size,connect graph[][],int a,int b)
    {
        boolean boo = true;
        for(int i=a;i<a+size;i++)
            if(graph[i][b].down==false)
                boo = false;
        for(int i=b;i<b+size;i++)
            if(graph[a+size][i].right==false)
                boo = false;
        for(int i=a+size;i>a;i--)
            if(graph[i][b+size].up==false)
                boo = false;
        for(int i=b+size;i>b;i--)
            if(graph[a][i].left==false)
                boo = false;
        return boo;
    }
}
