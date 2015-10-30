package uva;

import java.util.*;
import java.math.*;
public class uva00369 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextBigInteger())
        {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            
            BigInteger c = BigInteger.ONE;
            if(a.equals(BigInteger.ZERO)&&b.equals(BigInteger.ZERO))
                break;
            for(int i=1;i<b.intValue();i++)
            {
                c = c.multiply(a.add(new BigInteger(Integer.toString(i)).negate()));
                c = c.divide(new BigInteger(Integer.toString(i)));
            }
            c = c.multiply(a).divide(b);
            System.out.println(a+" things taken "+b+" at a time is "+c+" exactly.");
        }                
    }        
}
