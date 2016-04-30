package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva167 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        queen q = new queen();
        String str[][] = new String[10][10];
        Point p[][] = new Point[92][8];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                str[i][j] = "-";
        }
        for(int i=0;i<10;i++)
        {
            str[i][0] = "0";
            str[0][i] = "0";
            str[9][i] = "0";
            str[i][9] = "0";
        }    
        q.eightqueen(1, 1, str,p);
        
        int a = scanner.nextInt();
        for(int i=0;i<a;i++)
        {
            int ans[][] = new int[10][10];
            for(int k=1;k<9;k++)
            {
                for(int j=1;j<9;j++)
                   ans[k][j] = scanner.nextInt();
            }
            int max = 0;
            int add = 0;
            for(int k=0;k<92;k++)
            {
                for(int j=0;j<8;j++)
                    add = add + ans[p[k][j].y_number()][p[k][j].x_number()];
                if(add>max)
                    max = add;
                add = 0;
            }
            String str2 = "";
            for(int k=Integer.toString(max).length();k<5;k++)
                str2 = str2 + " ";
            System.out.println(str2+max);
        }            
    }   
}
class queen
{
    int a = 0;
    int b = 0;
    public void eightqueen(int x,int y,String str[][],Point p[][]) //和inspect連用　
    {
        if(y==9)
        {
            for(int i=1;i<9;i++){
                for(int j=1;j<9;j++){
                   if(str[i][j].equals("*"))
                   {
                       Point pp = new Point(i,j);
                       p[a][b] = pp;
                   }    
                }            
                b++;
            }
            b = 0;
            a++;
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
class Point 
{
    int x;
    int y;
    public Point(int a,int b)
    {
        x = a;
        y = b;
    }
    public int x_number()
    {
        return x;
    }
    public int y_number()
    {
        return y;
    }
}