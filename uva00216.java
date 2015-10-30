
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00216 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)  break;
            
            Point data[] = new Point[a];
            for(int i=0;i<a;i++)
                data[i] = new Point(scanner.nextDouble() , scanner.nextDouble());
            
            boo = new boolean[a];
            min = 1000000;
            for(int i=0;i<a;i++)
            {
                boo[i] = true;
                String s = "**********************************************************\nNetwork #"+n+"\n";
                dfs(0,data,0,s,i);
                boo[i] = false;
            }
            System.out.print(ans);
            System.out.printf("Number of feet of cable required is %.2f.%n",min);
            n++;
        }

    }        
    static StringBuilder ans;
    static double min = 1000000;
    static boolean boo[];
    
    public static void dfs(int layer , Point data[] , double dis ,String s, int prev)
    {
            if(layer==data.length-1)
            {
                if(dis<min)
                {
                    min = dis;
                    ans = new StringBuilder(s);
                    return;
                }
                
            }
            if(dis>min)
                return;
            for(int i=0;i<data.length;i++)
            {
                if(!boo[i])
                {
                    boo[i] = true;
                    double d =  data[prev].distance(data[i]);
                    Formatter fm = new Formatter();
                    fm.format("%.2f", d);
                    dfs(layer+1
                            , data 
                            , dis + d
                            , s + "Cable requirement to connect " + data[prev].out() +" to " + data[i].out() +" is " +fm.toString()+" feet.\n",i);
                    boo[i] = false;
                }
            }
            
    }
}
class Point
{
    double a;
    double b;
    public Point(double c,double d)
    {
        a = c;
        b = d;
        
    }
    public double distance(Point p)
    {
        return Math.sqrt((p.a-a)*(p.a-a)+(p.b-b)*(p.b-b))+16;
    }
    public String out()
    {
        return "("+(int)a+","+(int)b+")";
    }
}
