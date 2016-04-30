
package uva100_599;
import uva600_1600.Point;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva534 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
      
        for(int k=1;;k++)
        {
            int a = Integer.parseInt(scanner.nextLine());
            if(a==0)
                break;
            Point point[] = new Point[a];
            double distance[][] = new double[a][a];
            for(int i=0;;i++)
            {
                String str = scanner.nextLine();
                if(str.length()==0)
                    break;
                String s[] = str.split(" ");
                point[i] = new Point(Double.parseDouble(s[0]),Double.parseDouble(s[1]));
            }
            for(int i=0;i<a;i++)
                for(int j=0;j<a;j++)
                    distance[i][j] = point[i].distance(point[j].x, point[j].y);
            double answer[] = new double[a];
            boolean yes[] = new boolean[a];
            yes[0] = true;
            for(int i=0;i<a;i++)
                answer[i] = distance[0][i];
            int p = 0;
            for(int i=0;i<a;i++)
            {
                double min = 5000;
                for(int j=0;j<a;j++)
                {
                    if((min>answer[j])&&(!yes[j]))
                    {
                        min = answer[j];
                        p = j;
                    }                
                }
                yes[p] = true;
                for(int j=0;j<a;j++)
                {
                    if(p==j)
                        continue;
                    answer[j] = Math.min(answer[j],Math.max(answer[p],distance[p][j])); 
                }
            }
            System.out.printf("Scenario #%d%nFrog Distance = %.3f%n%n",k,answer[1]);
        }
    }
}
class Point
{
    double x,y;
    public Point(double a,double b)
    {
        x = a;
        y = b;
    }
    public double distance(double c,double d)
    {
        return Math.sqrt((x-c)*(x-c)+(y-d)*(y-d));
    }
}
