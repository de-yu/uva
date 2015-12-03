
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00336 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n , c = 1;
        while((n = scanner.nextInt())!=0)
        {
            HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
            int data[][] = new int[30][30];
            int point = 0;
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<n;i++)
            {
                int a = scanner.nextInt()
                    ,b = scanner.nextInt();
                
                if(map.get(a)==null)
                    map.put(a, point++);
                if(map.get(b)==null)
                    map.put(b, point++);
                
                data[map.get(a)][map.get(b)] = 1;
                data[map.get(b)][map.get(a)] = 1;
            }
            
            while(scanner.hasNextInt())
            {
                int p = scanner.nextInt()
                    ,ttl = scanner.nextInt()
                        ,sum = 0;
                
                if(p==0&&ttl==0)
                    break;
                boolean boo[] = new boolean[point];
                int order[] = new int[point];
                int order2[] = new int[point];
                Arrays.fill(order2, 50);
                Queue<Integer> queue = new LinkedList<Integer>(); 
                queue.add(map.get(p));
                
                if(map.get(p)!=null)
                {
                    while(queue.size()!=0)
                    {
                        int pp = queue.poll();
                        boo[pp] = true;
                        for(int i=0;i<point;i++)
                        {
                            if(data[pp][i]==1&&!boo[i])
                            {
                                queue.add(i);
                                boo[i] = true;
                                order[i] = order[pp] + 1;                    
                            }
                            if(data[pp][i]==1)
                                order2[i] = Math.min(order2[i], order[i]);
                        }   
                    }
                    for(int i=0;i<point;i++)
                    {
                        if(order2[i]<=ttl)
                            sum++;
                    }
                }
                sb.append("Case "+c+": "+(point-sum)+" nodes not reachable from node "+ p +" with TTL = "+ttl+".\n");
                c++;            
            }
            System.out.print(sb);
            
        }
    }
}
