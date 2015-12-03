
package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00615 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
        int n = 1;
        start:
        while(scanner.hasNextInt())
        {
           int a,b,sum = 0,max = 0;
           TreeSet<Integer> root = new TreeSet<Integer>();
           TreeSet<Integer> leaf = new TreeSet<Integer>();
           ArrayList<point_point> list = new ArrayList<point_point>();
           while(scanner.hasNextInt())
           {
               a = scanner.nextInt();
               b = scanner.nextInt();
               if(a==0&&b==0)
                   break;
               if(a<0&&b<0)
                   break start;
               leaf.add(b);
               root.add(a);
               max = Math.max(max, a);
               max = Math.max(max, b);
               list.add(new point_point(a,b));
               sum++;
           }for(int h:leaf)
           {
               root.remove(h);
           }
           if(leaf.size()==0)
           {
               System.out.printf("Case %d is a tree.%n",n++);
               continue;
           }
           if(sum!=leaf.size()||root.size()!=1)
           {
               System.out.printf("Case %d is not a tree.%n",n++);
               continue;
           }
           
           boolean boo[] = new boolean[max+1];
           Queue<Integer> queue = new LinkedList<Integer>();
           queue.add(root.first());
           
           while(queue.size()!=0)
           {
               int run = queue.poll();
               boo[run] = true;
               for(point_point p:list)
               {
                   if(p.start()==run)
                   {
                       queue.add(p.end());                       
                   }
               }
           }
            for(int h:leaf)
           {
               if(boo[h]==false)
               {
                   boo[0] = true;
                   System.out.printf("Case %d is not a tree.%n",n++);
                   break;
               }
           }
            if(!boo[0])
                System.out.printf("Case %d is a tree.%n",n++);
        }
    }
}
class point_point
{
    int start,end;
    public point_point(int a,int b)
    {
        start = a;
        end = b;
    }
    public int start()
    {
        return start;
    }
    public int end()
    {
        return end;
    }
}
