package uva;

import java.math.*;
import java.util.*;

public class uva10106 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BigInteger a,b;
        
        while(scanner.hasNextBigInteger())
        {   
            a =b = BigInteger.ZERO;
            a = scanner.nextBigInteger();
            b = scanner.nextBigInteger();
            
            a = a.multiply(b);
            System.out.println(a);
        }    
    }        
}
