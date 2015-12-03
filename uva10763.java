

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10763 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        while(true)
        {
            int a = Integer.parseInt(br.readLine());
            if(a==0)  break;
            HashMap<String ,Integer> map = new HashMap<String , Integer>();
            int sum = 0;
            
            while(a-->0)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int one = Integer.parseInt(st.nextToken()) ,two = Integer.parseInt(st.nextToken());
                country c = new country(one ,two);
                country c_rev = new country(two,one);
               int s = 0;

               if(map.get(c.tostring())!=null)
               {
                   s = map.get(c.tostring()) + 1;
                   map.put(c.tostring(), s);
                   sum++;
               }
               else if(map.get(c_rev.tostring())!=null)
               {
                   s = map.get(c_rev.tostring()) - 1;
                   map.put(c_rev.tostring(), s);
                   sum--;
               }
               else
               {
                   map.put(c.tostring(), 1);
                   sum++;
               }
            }
            if(sum!=0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
class country
{
    int a;
    int b;
    public country(int c,int d)
    {
        a = c;
        b = d;
    }
    public String tostring()
    {
        return a+" "+b;
    }
}
