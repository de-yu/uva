package uva10000_10599;

import java.io.*;
import java.util.*;
import java.math.*;
public class uva10254 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       ArrayList<BigInteger> list = new ArrayList<BigInteger>();
       list.add(BigInteger.ONE);
       BigInteger n = new BigInteger("2");
       int k = 0,s = 2;
       do{
           for(int i=0;i<s;i++)
           {
               list.add(list.get(k).add(n));
               k++;
           }
           s++;
           n = n.multiply(new BigInteger("2"));
       }while(list.size()<10001);
       
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==0)
           System.out.println("0");
           else
           System.out.println(list.get(a-1));
       }    
    }       
}
