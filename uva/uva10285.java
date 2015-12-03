
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10285 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            String s = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int data[][] = new int[a+2][b+2];
            int dp[][] = new int[a+2][b+2];
            for(int i=1;i<a+1;i++)
                for(int j=1;j<b+1;j++)
                    data[i][j] = scanner.nextInt();
            
            for(int i=0;i<a+2;i++)
                data[i][0] = data[i][b+1] = -1;
            for(int i=0;i<b+2;i++)
                data[0][i] = data[a+1][i] = -1;
            
            int max = 0; 
            for(int i=1;i<a+1;i++)
                for(int j=1;j<b+1;j++)
                    max = Math.max(max,dfs(dp,data,i,j));
            System.out.println(s+": "+max);
            
        }
    }
    static int x[] = {1,0,-1,0};
    static int y[] = {0,-1,0,1};
    public static int dfs(int dp[][],int data[][],int a,int b)
    {
        if(dp[a][b]!=0)
            return dp[a][b];
        
        for(int i=0;i<4;i++)
        {
            int xx = b + x[i];
            int yy = a + y[i];
            if(data[yy][xx]!=-1&&data[yy][xx]>data[a][b])
               dp[a][b] = Math.max(dp[a][b],dfs(dp,data,yy,xx));
        }
        
        return ++dp[a][b];
    }
}
