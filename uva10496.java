

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10496
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       int n = scanner.nextInt();
       
       while(n-->0)
       {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           
           int pos_a = scanner.nextInt();
           int pos_b = scanner.nextInt();
           
           ArrayList<position>  list = new ArrayList<position>();
           list.add(new position(pos_a,pos_b));
           
           int num = scanner.nextInt();
           while(num-->0)
           {
               int c = scanner.nextInt();
               int d = scanner.nextInt();
               if(c>a||d>b)
                   continue;
               else
                   list.add(new position(c,d));
           }
           boolean boo[] = new boolean[list.size()];
           size = list.size();
           
           System.out.println("The shortest path has length "+salesPerson(0, list ,boo , 0));
       }
    }
    static int size = 0;
    public static int salesPerson(int layer, ArrayList<position>  list ,boolean boo[] , int prev)
    {
        int min = Integer.MAX_VALUE;
        
        if(layer==size-1)
            return list.get(0).distance(list.get(prev));
        for(int i=1;i<size;i++)
        {
            if(!boo[i])
            {
                boo[i] = true;
                min = Math.min(min, list.get(prev).distance(list.get(i))+salesPerson(layer+1 , list , boo , i));
                boo[i] = false;
            }
        }
        return min;
    }
}
class position
{
    int x;
    int y;
    public position(int a,int b)
    {
        y = a;
        x = b;
    }
    public int distance(position p)
    {
        return Math.abs(x-p.x) + Math.abs(y-p.y);
    }
}
