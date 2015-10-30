

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11039 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        while(a>0)
        {
            int b = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pos = new PriorityQueue<Integer>();
            PriorityQueue<Integer> negp = new PriorityQueue<Integer>();
            Stack<Integer> neg = new Stack<Integer>();
            while(b>0)
            {
                int c = Integer.parseInt(br.readLine());
                if(c>0)
                    pos.add(c);
                else
                    negp.add(c);
                b--;
            }
            while(negp.size()!=0)
            {
                neg.add(negp.poll());
            }
            int sum = 1,f,boo = 0;
            if(pos.size()==0||neg.size()==0)
            {
                System.out.println(sum);
            }
            else{
                
            if(pos.peek()>Math.abs(neg.peek()))
                f = neg.pop();
            else
                f = pos.poll();
            while((pos.size()!=0&&neg.size()!=0)||boo==0)
            {
                if(pos.size()==0||neg.size()==0)
                    boo = 1;
                if(f>0)
                {
                    while(neg.size()!=0)
                    {
                        int p = neg.pop();
                        if(Math.abs(p)>f)
                        {
                            f = p;
                            sum++;
                            break;
                        }
                    }
                }
                else
                {
                    while(pos.size()!=0)
                    {
                        int p = pos.poll();
                        if(Math.abs(p)>Math.abs(f))
                        {
                            f = p;
                            sum++;
                            break;
                        }
                    }
                }
            }
            System.out.println(sum);
            }
            a--;
        }        
    }
}
