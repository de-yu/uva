

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10700
{
       public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            String str = scanner.next();
            String a = change(str,"*","+");
            String b = change(str,"+","*");
            String add[] = a.split(" ");
            String multiply[] = b.split(" ");
            Long min = 0L,max = 1L;
            
            Queue<Long> queue = new LinkedList<Long>();
            caculate(queue,add,"+");            
            while(queue.size()!=0)
                min = min + queue.poll();
            
            caculate(queue,multiply,"*");
            while(queue.size()!=0)
                max = max * queue.poll();
            
            System.out.printf("The maximum and minimum are %d and %d.%n",max,min);
        }  
    }
    public static String change(String str,String a,String b)
    {
        String ans = str.replace(a," ");
        ans = ans.replace(b, " "+b+" ");
        
        return ans;
    }
    public static void caculate(Queue<Long> queue,String add[],String a)
    {
         boolean boo = false;
         int leng = add.length;
         Long sum = 0L;
         
          for(int i=0;i<leng;i++)
            {
               if(add[i].equals(a))
               {
                   queue.add(sum);
                   boo = false;
               }
               else
               {
                   if(!boo)
                   {
                       sum = Long.parseLong(add[i]);
                       boo = true;
                   }
                   else
                   {
                       if(a.equals("+"))
                            sum *= Long.parseLong(add[i]);
                       else
                           sum += Long.parseLong(add[i]);
                   }
               }
               if(i==leng-1)
                   queue.add(sum);
            }
    }
}
