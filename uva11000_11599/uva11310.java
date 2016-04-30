package uva11000_11599;

import java.io.*;
import java.util.*;
import java.math.*;
public class uva11310 
{
     public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         ArrayList<BigInteger> list = new ArrayList<BigInteger>();
         BigInteger four = new BigInteger("4");
         BigInteger two = new BigInteger("2");
         list.add(BigInteger.ONE);
         list.add(BigInteger.ONE);
         list.add(new BigInteger("5"));
         
         for(int i=3;i<=40;i++)
         list.add(list.get(i-1).add(list.get(i-2).multiply(four)).add(list.get(i-3).multiply(two)));
         
         
             int a = scanner.nextInt();
             for(int i=0;i<a;i++)    
                System.out.println(list.get(scanner.nextInt()));
                   
                                        
    }
}
