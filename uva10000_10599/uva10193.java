package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10193 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int a = scanner.nextInt();
       for(int i=1;i<=a;i++)
       {
          int b = scanner.nextInt(2);
          int c = scanner.nextInt(2);
          BigInteger d = new BigInteger(Integer.toString(b));
          BigInteger e = new BigInteger(Integer.toString(c));
          if(d.gcd(e).equals(BigInteger.ONE))
              System.out.println("Pair #"+i+": Love is not all you need!");
          else
              System.out.println("Pair #"+i+": All you need is love!");
       }    
    }
}
