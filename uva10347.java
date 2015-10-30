

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10347 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        double data[] = new double[3];
        while(scanner.hasNextDouble())
        {          
            for(int i=0;i<3;i++)
                data[i] = scanner.nextDouble();
            Arrays.sort(data);
            
            if(data[2]>=data[1]+data[0])
                System.out.println("-1.000");
            else
            {
                double s = (data[0] + data[1] + data[2])/2;
                System.out.printf("%.3f%n",Math.sqrt(s*(s-data[0])*(s-data[1])*(s-data[2]))*4/3);
            }
        }
    }
}
