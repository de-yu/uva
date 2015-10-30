
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00539 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           if(a==0)        break;
           
           
           int graph[][] = new int[a][a];
           boo = new boolean[a][a];
           max = 0;
                   
           while(b-->0)
           {
               int c = scanner.nextInt();
               int d = scanner.nextInt();
               graph[c][d] = 1;
               graph[d][c] = 1;
           }
           
           for(int i=0;i<a;i++)
           {

               DFS(graph , 0 , i , a );

               //System.out.println(max+"\n");
           }
           
           System.out.println(max);
       }
    }
    static int max = 0;
    static boolean boo[][];
    
    public static void DFS(int graph[][] ,int layer , int now , int ps)
    {
        max = Math.max(max , layer);
        //System.out.println(now +" " +layer);
        boolean end = false;
        for(int i=0;i<ps;i++)
        {
            if(!boo[now][i]&&graph[now][i]>0)
            {
                boo[now][i] = true;
                boo[i][now] = true;
                DFS(graph , layer + 1 ,i , ps);
                boo[now][i] = false;
                boo[i][now] = false;
            }
        }
    }
}
