
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10530
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        ArrayList<high> list = new ArrayList<high>();
        while(scanner.hasNextLine())
        {
            int a = Integer.parseInt(scanner.nextLine());
            if(a==0)  break;
            String str = scanner.nextLine();
            if(str.equals("right on"))
            {
                boolean boo = false;
                for(high h:list)
                {
                    if(h.a<a)
                    {
                        if(!h.s.equals("too low")){
                            boo = true;
                            break;
                        }
                    }
                    else if(h.a>a)
                    {
                         if(!h.s.equals("too high")){
                            boo = true;
                            break;
                        }
                    }
                    else
                    {
                        boo = true;
                            break;
                    }
                }   if(boo)
                        System.out.println("Stan is dishonest");
                    else
                        System.out.println("Stan may be honest");
                    list = new ArrayList<high>();
            }
            else
                list.add(new high(a,str));
        }
    }
}
class high
{
    int a;
    String s;
    public high(int b,String str)
    {
        a = b;
        s = str;
    }
}
