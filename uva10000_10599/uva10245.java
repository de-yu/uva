
package uva10000_10599;

import uva100_599.Point;
import uva600_1600.Point;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10245 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int amount;
        Formatter fm = new Formatter();
        StringTokenizer st;
        while((amount = Integer.parseInt(br.readLine()))!=0)
        {
            Point data[] = new Point[amount];
            
            for(int i=0;i<amount;i++)
            {
                st = new StringTokenizer(br.readLine());
                double x = Double.parseDouble(st.nextToken())
                        , y = Double.parseDouble(st.nextToken());
                
                data[i] = new Point(x,y);
            }
            Arrays.sort(data);
            
            double distance = divide(data , 0 , amount-1);
            if(distance>10000)
               fm.format("INFINITY%n");
            else
               fm.format("%.4f%n", distance);
        }
        System.out.print(fm.toString());
    }

    public static double divide(Point data[] , int start , int end)
    {
        if(start>=end)
            return 10001;
        int mid = (start + end)/2;
        
        double left = divide(data , start , mid);
        double right = divide(data , mid + 1 ,end);
        double center = combine(data,mid, start , end);

        return Math.min(center, Math.min(left,right));
    }
    public static double combine(Point data[] , int mid , int left , int right)
    {
        double min = 10001;

        for(int i=mid-(mid-left)/2;i<=mid+(right-mid)/2;i++)
            for(int j=i+1;j<=mid+(right-mid)/2;j++)
                min = Math.min( min , data[i].distance(data[j]));
            
        return min;
    }
}
class Point implements Comparable<Point>
{
    double x;
    double y;
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p)
    {
        return Math.sqrt(Math.pow((p.x-x),2) + Math.pow((p.y-y),2));
    }
    public int compareTo(Point t) {
       if(x>t.x)
            return 1;
        else if(t.x>x)
            return -1;
        else
            return 0;
    }
}
