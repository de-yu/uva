

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva439 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNext())
        {
            String a = scanner.next();
            String b = scanner.next();
            graph g = new graph();
            int data[][] = new int[12][12];
            int y = (int)a.charAt(0)-95;
            int x = (int)a.charAt(1)-47;
            int y1 = (int)b.charAt(0)-95;
            int x1 = (int)b.charAt(1)-47;
            for(int j=0;j<2;j++){
                for(int i=0;i<12;i++){
                    data[0+j][i] = 99;
                    data[i][0+j] = 99;
                    data[i][11-j] = 99;
                    data[11-j][i] = 99;
                }
            }
            if(a.equals(b))
             System.out.println("To get from "+a+" to "+b+" takes 0 knight moves.");
            else{    
            System.out.print("To get from "+a+" to "+b+" takes ");
            g.bfs(x, y, x1, y1,data);
            }
        }    
    }   
}
class graph
{
    int xx[] = {2,1,-1,-2};
    int yy[] ={1,-1,2,-2,2,-2,1,-1};
    public void bfs(int x,int y,int x1,int y1,int data[][])
    {
        Queue<Integer> xnum = new LinkedList<Integer>();
        Queue<Integer> ynum = new LinkedList<Integer>();
        xnum.add(x);
        ynum.add(y);
        while(xnum.size()!=0)
        {
            x = xnum.poll();
            y = ynum.poll();
            for(int i=0;i<8;i++)
            {
                int x2 = x + xx[i/2];
                int y2 = y + yy[i];
                if(data[y2][x2]==0)
                {    
                    data[y2][x2] = data[y][x] + 1;
                    xnum.add(x2);
                    ynum.add(y2);
                }
                else
                {
                    if(data[y2][x2]>0||data[y2][x2]==99)
                        continue;
                }    
            }
        }
        System.out.println(data[y1][x1]+" knight moves.");
                
    }
}
