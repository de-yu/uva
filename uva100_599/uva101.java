
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva101 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        while(scanner.hasNextInt())
        {
            int sum = scanner.nextInt();
            ArrayList<Integer> list[] = new ArrayList[sum];
            for(int i=0;i<sum;i++)
            {
                list[i] = new ArrayList<Integer>();
                list[i].add(i);
            }
            
            while(scanner.hasNext())
            {
                String a = scanner.next();
                if(a.equals("quit"))
                    break;
                int b = scanner.nextInt();
                String c = scanner.next();
                int d = scanner.nextInt();
                
                if(b==d||(find(list,b)==find(list,d)))
                    continue;
                
                if(a.equals("move")&&c.equals("onto"))
                {
                    back(list,b);
                    back(list,d);
                    after(list,b,d);
                }
                else if(a.equals("move")&&c.equals("over"))
                {
                    back(list,b);
                     after(list,b,d);
                }
                else if(a.equals("pile")&&c.equals("onto"))
                {
                     back(list,d);
                    after(list,b,d);
                }
                else
                {
                    after(list,b,d);
                }
            }        
            StringBuffer sb = new StringBuffer("");
            for(int i=0;i<sum;i++)
            {
                sb.append(i+":");
                for(int j:list[i])
                {
                    sb.append(" "+j);
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
    public static void back(ArrayList<Integer> list[],int b)
    {
        int pos = find(list,b);
        int i=list[pos].size()-1;
        while(i>=0)
        {
            int p = list[pos].get(i);
            if(p==b)
                break;
            list[pos].remove(i);
            list[p].add(p);
            i--;
        }
    }
    public static void after(ArrayList<Integer> list[],int b,int d)
    {
       Stack<Integer> s = new Stack<Integer>();
       int pos_d = find(list,d);
       int pos_b = find(list,b);
        int i=list[pos_b].size()-1;
        while(i>=0)
        {
            int p = list[pos_b].get(i);
            s.add(p);
            list[pos_b].remove(i);
            i--;
            if(b==p)
                break;
        }
        while(s.size()!=0)
        {
            list[pos_d].add(s.pop());
        }        
    }
    public static int find(ArrayList<Integer> list[],int b)
    {
        for(int i=0;i<list.length;i++)
        {
            if(list[i].contains(b))
                return i;
        }
        return 0;
    }
}