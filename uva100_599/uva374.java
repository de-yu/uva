package uva100_599;

import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva374
{   
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextBigInteger())
        {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            
            System.out.println(a.modPow(b, c));
        }
    }
}
