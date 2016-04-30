package uva100_599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva424
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        
        while(scanner.hasNextBigInteger())
        {
            a = scanner.nextBigInteger();
            b = b.add(a);
            
            if(a.equals(BigInteger.ZERO))
            {
                System.out.println(b);
                break;
            }
        }    
    }
}
