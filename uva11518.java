
package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11518 
{
   public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
       int a = Integer.parseInt(br.readLine());
       while(a-->0)
       {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int b = Integer.parseInt(st.nextToken());
           int c = Integer.parseInt(st.nextToken());
           int d = Integer.parseInt(st.nextToken());
           
           Find find = new Find(b);
           
           while(c-->0)
           {
               st = new StringTokenizer(br.readLine());
               int e = Integer.parseInt(st.nextToken());
               int f = Integer.parseInt(st.nextToken());
               find.add(e,f);
           }
           while(d-->0)
           {
               int g = Integer.parseInt(br.readLine());
               find.connect(g);
           }
           System.out.println(find.re_sum());
       }
    }
}
class Find
{
    int sum;
    ArrayList<Integer> list[];
    boolean boo[];
    public Find(int b)
    {
        sum = 0;
         list = new ArrayList[b+1];
         for(int i=0;i<=b;i++)
               list[i] = new ArrayList<Integer>();
         boo = new boolean[b+1];
    }
    public void add(int e,int f)
    {
        list[e].add(f);
    }
    public void connect(int g)
    {
        if(boo[g])
            return;
        sum++;
        boo[g] = true;
        int size = list[g].size();
        for(int i=0;i<size;i++)
        {
            if(!boo[list[g].get(i)])
                connect(list[g].get(i));
        }
    }
    public int re_sum()
    {
        return sum;
    }
}
