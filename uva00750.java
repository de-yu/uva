
package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00750 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String data[][] = new String[10][10];
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                data[i][j] = "-";
        for(int i=0;i<10;i++)
        {
            data[i][0] = "0";
            data[0][i] = "0";
            data[i][9] = "0";
            data[9][i] = "0";
        }
        point p[][] = new point[92][8];
        backtracking b = new backtracking();
        b.eightqueen(1, 1, data,p);
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            point pp = new point(c,d);
            int s[] = new int[8];
            int e = 1;
            
            ArrayList<String> list = new ArrayList<String>();
            for(int j=91;j>=0;j--)
            {
                for(int k=0;k<8;k++)
                {
                    if(pp.equals(p[j][k]))
                    {
                        for(int m=0;m<8;m++)
                            s[p[j][m].x-1] =p[j][m].y;
                        list.add("      "+s[0]+" "+s[1]+" "+s[2]+" "+s[3]+" "+s[4]+" "+s[5]+" "+s[6]+" "+s[7]+"\n");
                    }
                }
            }
            Collections.sort(list);
            if(i>0)
                System.out.println();
            System.out.println("SOLN       COLUMN\n #      1 2 3 4 5 6 7 8\n");
            for(String ss:list)            
            {
                System.out.printf("%2d%s",e,ss);
                e++;
            }
        }
    }
}
class backtracking
{
    int n = 0;
    public void eightqueen(int x,int y,String str[][],point p[][]) //和inspect連用　
    {
        if(y==9)
        {
            for(int i=1;i<9;i++){
                for(int j=1;j<9;j++){
                    if(str[i][j].equals("*"))
                        p[n][i-1] = new point(i,j);
                }            
            }
            n++;
            return;
        }
        for(int i=1;i<9;i++)
        {
            if(inspect(str,i,y))
            {
                str[y][i] = "*";
                eightqueen(x,y+1,str,p);
                str[y][i] = "-";
            }
        }        
    }
    private boolean inspect(String str[][],int xx,int yy)//和eightqueen連用
    {
         int x[] = {1,-1,0,0,1,-1,1,-1};
         int y[] = {0,0,1,-1,1,1,-1,-1};
         for(int i=0;i<8;i++)
         {
             int s = xx;
             int n = yy;
             while(!str[n+y[i]][s+x[i]].equals("0"))
             {
                 s = s + x[i];
                 n = n + y[i];
                 if(str[n][s].equals("*"))
                     return false;
             }
         }
         return true;
    }
}
class point
{
    int x,y;
    public point(int a,int b)
    {
        x = b;
        y = a;
    }
    public boolean equals(point p)
    {
        if(p.x==x&&p.y==y)
            return true;
        else
            return false;
    }
}
