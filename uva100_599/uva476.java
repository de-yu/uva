
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva476
{
public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));	 
            ArrayList<polygon> list = new ArrayList<polygon>();
            while(scanner.hasNext())
            {
                String str = scanner.next();
                if(str.equals("*"))
                    break;
                else if(str.equals("r")){
                    polygon p = new polygon(str,scanner.nextDouble(),
                            scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                    list.add(p);
                }
            }
            int n = 1;
            while(scanner.hasNextDouble())
            {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                if(a==9999.9&&b==9999.9)
                    break;
                boolean boo = true;
                for(int i=0;i<list.size();i++)
                {
                    polygon p = list.get(i);
                    if(p.str.equals("r"))
                    {
                        if(a>p.a&&a<p.c&&b<p.b&&b>p.d){
                            System.out.println("Point "+n+" is contained in figure "+(i+1));
                        boo = false;
                        }
                    }
                }
                if(boo)
                    System.out.println("Point "+n+" is not contained in any figure");
                n++;
            }
        }     
    
}
class polygon
{
    String str;
    double a,b,c,d,e,f;
    public polygon(String s,double e,double f,double g)
    {
        str = s;
        a = e;
        b = f;
        c = g;
    }
}
