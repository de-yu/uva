package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10519
{   
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        while(scanner.hasNextBigInteger())
        {
            BigInteger b = scanner.nextBigInteger();
            BigInteger two = new BigInteger("2");
            if(b.equals(BigInteger.ZERO))
                System.out.println("1");
            else
            System.out.println(b.multiply(b).add(b.negate()).add(two));
        }    
    }    
}
