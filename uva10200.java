package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10200 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        Double data[] = new Double[10001];
        data[0] = 0.0;
        for(int i=1;i<10001;i++)
            data[i] = data[i-1] + correct(i);
        
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double sum  = (data[b]-data[a]+correct(a))/((double)b-(double)a+1)*100;
            
            System.out.printf("%.2f%n",sum);
        }
    }
    public static int correct(int a)
    {
        BigInteger bi = BigInteger.valueOf(a*a+a+41);
        if(bi.isProbablePrime(2)&&bi.isProbablePrime(7))
            return 1;
        else
            return 0;
    }
}
