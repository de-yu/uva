

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10954 
{
     
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
        while(true)
        {
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                break;
            String s = br.readLine();
            st = new StringTokenizer(s);
            
            PriorityQueue<Long> pq = new PriorityQueue<Long>();
            for(int i=0;i<a;i++)
                pq.add(Long.parseLong(st.nextToken()));
            
            Long sum = 0L;
            while(pq.size()!=1)
            {
                Long b = pq.poll();
                Long c = pq.poll();
                Long d = b+c;
                sum = sum + d;
                pq.add(d);
            }
            System.out.println(sum);
        }
    }
}
