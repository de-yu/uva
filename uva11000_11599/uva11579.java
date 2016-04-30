package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11579 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int a = Integer.parseInt(br.readLine());
        Formatter fm = new Formatter();
        
        for(int i=0;i<a;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int b = Integer.parseInt(st.nextToken());
            Double data[] = new Double[b];
            
            
            for(int j=0;j<b;j++)
                data[j] = Double.parseDouble(st.nextToken());
            Arrays.sort(data);
            
            double max = 0;
            for(int j=b-1;j>=0;j--)
            {
                if(j-2<0){
                    break;
                }
                if(correct(data[j],data[j-1],data[j-2]))
                {
                    max = Math.max(max,area(data[j],data[j-1],data[j-2]));
                }
            }
            fm.format("%.2f%n",max);

        }
        System.out.print(fm.toString());
    }
    public static boolean correct(Double a,Double b,Double c)
    {
        if(b+c>a)
            return true;
        else 
            return false;
    }
    public static Double area(Double a,Double b,Double c)
    {
        Double d = (a+b+c)/2;
        
        return Math.sqrt((d-a)*(d-b)*(d-c)*d);
                
    }
}
