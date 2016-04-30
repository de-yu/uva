

package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva122 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        while(scanner.hasNext())
        {
            StringBuffer sb = new StringBuffer("");
            int a = 0,b = 0;
            node data[] = new node[100000];
            for(int i=0;i<100000;i++)
                data[i] = new node();
            while(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("()"))
                    break;
                string_handle(s,data);
                a++;
            }
            
            Queue<node> q = new LinkedList<node>();
            q.add(data[0]);
            
            while(q.size()!=0)
            {
                node n = q.poll();
                if(n.use==1)
                {
                    q.add(data[n.pos*2+1]);
                    q.add(data[n.pos*2+2]);
                    if(b==0)
                    sb.append(n.num);
                    else
                        sb.append(" "+n.num);
                    b++;
                }
            }
            if(a==b)
                System.out.println(sb);
            else
                System.out.println("not complete");
            
        }
    }
    public static void string_handle(String s,node data[])
    {
        int num = 0;
        String str = "";
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==',')
            {
                num = Integer.parseInt(str);
                str = "";
                continue;
            }
            if(s.charAt(i)==')')
                continue;
            str = str + Character.toString(s.charAt(i));
        }
        if(str.equals(""))
        {
            data[0].num = num;
            data[0].use++;
            data[0].pos = 0;
        }
        else
        {
            int pos = 0;
            
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='L')
                    pos = pos*2 + 1;
                else
                    pos = pos*2 + 2;
            }
            data[pos].num = num;
            data[pos].use++;
            data[pos].pos = pos;
        }
    }
}
class node
{
    int num;
    int use;
    int pos;
    public void node()
    {
        num = 0;
        use = 0;
    }
}