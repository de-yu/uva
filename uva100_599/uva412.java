
package uva100_599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva412 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            int data[] = new int[a];
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt();
            double b = a*(a-1)/2,c = 0;
            
            for(int i=0;i<a;i++)
                for(int j=i+1;j<a;j++)
                    if(gcd(data[i],data[j])==1)
                        c++;
            if(c==0)
                System.out.println("No estimate for this data set.");
            else
            {
                double d = Math.sqrt(6*b/c);            
                System.out.printf("%.6f%n",d);
            }
        }    
    }        
    public static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
