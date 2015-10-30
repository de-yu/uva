
package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10026 
{
    
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int n = scanner.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int a = scanner.nextInt();
            ArrayList<money> data = new ArrayList<money>();
            
            for(int j=0;j<a;j++)
                data.add(new money(scanner.nextDouble(),scanner.nextDouble()));
            
            boolean boo[] = new boolean[data.size()];
           
            
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<data.size();j++)
            { 
                double max = 0;
                int maxpoint = 0;
                for(int k=0;k<data.size();k++)
                {
                    if(!boo[k]&&data.get(k).scale()>max)
                    {
                        max = data.get(k).scale();
                        maxpoint = k;
                    }
                }
                boo[maxpoint] = true;
                if(j==0)
                 sb.append((maxpoint+1));
                else
                    sb.append(" "+(maxpoint+1));
            }
            if(i!=0)
                System.out.println();
            System.out.println(sb);
        }
    }
}
class money
{
    double m,day;
    public money(double a,double b)
    {
        m = b;
        day = a;
    }
    public double scale()
    {
        return m/day;
    }
}
