
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10162 
{
    
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        BigInteger data[] = new BigInteger[101];
        for(int i=0;i<101;i++)
            data[i] = BigInteger.valueOf(i);
        for(int i=1;i<101;i++)
        {
            data[i] = data[i].pow(i);
            data[i] = data[i].add(data[i-1]);
        }
        
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(str.equals("0"))
                break;
            if(str.length()<=1)
                System.out.println(data[Integer.parseInt(str)].mod(BigInteger.TEN));
            else
            {
            str = str.substring(str.length()-2,str.length());
            System.out.println(data[Integer.parseInt(str)].mod(BigInteger.TEN));
            }
            
        }
    }
}
