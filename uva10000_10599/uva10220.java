package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10220 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       ArrayList<BigInteger> data = new ArrayList<BigInteger>();
       data.add(BigInteger.ONE);
       data.add(new BigInteger("2"));
       for(int i=2;i<1001;i++)
           data.add(data.get(i-1).multiply(BigInteger.valueOf(i+1)));
       number num = new number();
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();        
           System.out.println(num.ans(data.get(a-1).toString()));
       }
       
    }
}
class number
{
    public int ans(String str)
    {
        int sum = 0;
        for(int i=0;i<str.length();i++)
            sum = sum + (int)str.charAt(i)-48;
        return sum;
    }        
}
