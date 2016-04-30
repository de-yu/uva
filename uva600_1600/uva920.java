

package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva920 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
             
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int a = scanner.nextInt();
            HashMap<Double,Double> data =new HashMap<Double,Double>();
            double x[] = new double[a];           
            double b;
            double c;
            for(int j=0;j<a;j++)
            {
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                data.put(b, c);
                x[j] = b;
            }
            Arrays.sort(x);
            double sum = 0;            
            double before = x[a-2];
            for(int j=a-3;j>=0;j--)
            {              
                if(data.get(x[j])>data.get(before))
                {
                    double y1 = data.get(x[j]);
                    double y2 = data.get(x[j+1]);
                    sum = sum + Math.sqrt(Math.pow(x[j]-x[j+1],2)+Math.pow(y1-y2,2))
                            *(y1-data.get(before))/(y1-y2);
                    before = x[j];
                }
            }
            sum = sum + Math.sqrt(Math.pow(x[a-1]-x[a-2],2)+Math.pow(data.get(x[a-1])-data.get(x[a-2]),2));
            System.out.printf("%.2f%n",sum);
        }
    }
}
