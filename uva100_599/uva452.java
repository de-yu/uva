

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva452 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        while(n-->0)
        {
            int graph[][] = new int[26][26];
            int point[] = new int[26];
            int edge[] = new int[26];
            boolean use[] = new boolean[26];
            int sum = 0;
            while(scanner.hasNextLine())
            {
                s = scanner.nextLine();
                if(s.length()==0)
                    break;
                StringTokenizer st = new StringTokenizer(s);
                
                int a = st.nextToken().charAt(0)-65;
                int b = Integer.parseInt(st.nextToken());
                point[a] = b;
                use[a] = true;
                if(st.hasMoreTokens())
                {
                    String c = st.nextToken();
                    edge[a] += c.length();
                    for(int i=c.length()-1;i>=0;i--)
                    {
                        graph[c.charAt(i)-65][a] = 1;                     
                    }  
                }  
            }

            for(;;)
            {
                int max = 10000
                        ,p = 0;
                boolean end = true; 
                
                for(int i=0;i<26;i++)
                {
                    if(point[i]<max && use[i] && edge[i]==0)
                    {
                        max = point[i];
                        p = i;
                    }
                }
                for(int i=0;i<26;i++)
                {
                    if(use[i] && edge[i]==0)
                        point[i] -= max;
                }
                 for(int i=0;i<26;i++)
                {
                    if(graph[p][i]==1)
                        edge[i]--;
                }
                if(max!=10000)
                {
                    sum += max;
                    use[p] = false;
                }
                for(int i=0;i<26;i++)
                {
                    if(use[i])
                        end = false;
                }
                if(end)
                    break;
            }
            
            if(n==0)
                System.out.println(sum);
            else
                System.out.println(sum+"\n");
        }
    }
}
