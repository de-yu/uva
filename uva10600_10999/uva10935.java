

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva10935 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            Queue<Integer> q = new LinkedList<Integer>();
            StringBuffer sb = new StringBuffer("Discarded cards:");
            for(int i=1;i<=a;i++)
                q.add(i);
            
            while(q.size()!=1)
            {
               if(q.size()!=a)
                   sb.append(",");
                sb.append(" "+q.poll());
                int n = q.poll();
                q.add(n);
            }
            System.out.println(sb);
            System.out.println("Remaining card: "+q.poll());
        }
    }
}
