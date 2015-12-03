
package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00572 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        graph3 g = new graph3();
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0&&b==0)
                break;
            String data[][] = new String[a+2][b+2];
            
            for(int i=0;i<=a+1;i++)
                for(int j=0;j<=b+1;j++)
                    data[i][j] = "*";
            
            for(int i=1;i<=a;i++)
            {
                String str = scanner.next();
                for(int j=1;j<=b;j++)
                    data[i][j] = Character.toString(str.charAt(j-1));            
            }
            g.bfs(data, a, b);
        }
    }
}
class graph3
{
    public void bfs(String data[][],int a,int b)
    {
        int x[] = {1,1,1,-1,-1,-1,0,0};
        int y[] = {1,0,-1,1,0,-1,-1,1};
        Queue<Integer> xq = new LinkedList<Integer>();
        Queue<Integer> yq = new LinkedList<Integer>();
        int sum = 0;
            for(int i=1;i<=a;i++)
            {
                for(int j=1;j<=b;j++)
                {
                    if(data[i][j].equals("@"))
                    {
                        sum++;
                        xq.add(j);
                        yq.add(i);
                        while(xq.size()!=0)
                        {
                            int xx = xq.poll();
                            int yy = yq.poll();
                            data[yy][xx] = "*";
                            for(int k=0;k<8;k++)
                            {   
                                if(data[yy+y[k]][xx+x[k]].equals("@"))
                                {
                                    xq.add(xx+x[k]);
                                    yq.add(yy+y[k]);
                                }
                            }
                        }
                    }                    
                }                    
            }
            System.out.println(sum);
    }
}
