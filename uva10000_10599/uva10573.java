package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10573 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(scanner.nextLine());
        
        for(int i=0;i<a;i++)
        {
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            
            if(st.countTokens()==1)
            {
                double d = Double.parseDouble(st.nextToken());
                System.out.printf("%.4f%n",d*d*Math.PI/8);
            }
            else
            {
                double e = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                System.out.printf("%.4f%n",2*e*f*Math.PI);
            }
        }
    }
}
