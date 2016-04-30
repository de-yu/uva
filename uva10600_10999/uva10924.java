package uva10600_10999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10924
{   
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNext())
        {
            String str = scanner.next();
            int a = 0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)<=90)
                    a = a + (int)str.charAt(i)-38;
                else
                    a = a + (int)str.charAt(i)-96;
            }
            BigInteger b = new BigInteger(Integer.toString(a));
            if(a==1)
            {
                System.out.println("It is a prime word.");
                continue;
            }
            if(b.isProbablePrime(2)&&b.isProbablePrime(7)&&b.isProbablePrime(61))
                System.out.println("It is a prime word.");
            else
                System.out.println("It is not a prime word.");
            
        }    
    }    
}
