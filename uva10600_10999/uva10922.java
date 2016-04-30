package uva10600_10999;

import java.util.*;
import java.math.*;

public class uva10922 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext())
        {
            String a = scanner.next();
            BigInteger b = new BigInteger(a,10);
            BigInteger nine = new BigInteger("9",10);
            int d = 0;
            int e = 0;
            if(a.equals("0"))
                break;
            if(b.mod(nine).equals(BigInteger.ZERO))
            {
                do
                {
                    d = 0;
                    for(int i=0;i<a.length();i++)
                        d = d + Integer.parseInt(Character.toString(a.charAt(i)));
                     e++;
                     a = Integer.toString(d);
                }while(!(d==9));
                System.out.println(b+" is a multiple of 9 and has 9-degree "+e+".");
            }
            else
                System.out.println(a+" is not a multiple of 9.");
        }    
    }        
}
