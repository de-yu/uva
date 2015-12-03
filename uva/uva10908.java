

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10908 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char graph[][] = new char[a+2][b+2];
            
            for(int i=0;i<a;i++)
            {
                String str = br.readLine();
                for(int j=0;j<b;j++)
                    graph[i+1][j+1] = str.charAt(j);
            }
            int d,e;
            System.out.printf("%d %d %d%n",a,b,c);
            StringBuilder sb = new StringBuilder("");
            while(c-->0)
            {
                st = new StringTokenizer(br.readLine());
                d = Integer.parseInt(st.nextToken()) + 1;
                e = Integer.parseInt(st.nextToken()) + 1;

                char cc = graph[d][e];
                int sum = 1;
                boolean boo = false;
                for(int i=1;;i++)
                {
                    int f = i;
                    int g = -i;
                    for(int j=g;j<=f;j++)
                    {
                        if(graph[d+g][e+j]!=cc||graph[d+j][e+g]!=cc||graph[d+f][e+j]!=cc||graph[d+j][e+f]!=cc)
                        {
                            boo = true;
                            break;
                        }
                    }    
                    if(boo)
                        break;
                    sum++;
                }
                sb.append((sum*2-1)+"\n");
            }
            System.out.print(sb);
        }   
    }
}
