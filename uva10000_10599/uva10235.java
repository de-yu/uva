package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10235 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));     
       while(scanner.hasNext())
       {
           oppsite os = new oppsite();
           String a = scanner.next();
           BigInteger b = new BigInteger(a);
           BigInteger c = new BigInteger(os.ans(a));
           if(!(b.isProbablePrime(2)&&b.isProbablePrime(7)&&b.isProbablePrime(61)))
               System.out.println(a+" is not prime.");           
           else
           {
               if(c.equals(b))
                   System.out.println(a+" is prime.");
               else if(c.isProbablePrime(2)&&c.isProbablePrime(7)&&c.isProbablePrime(61))
                   System.out.println(a+" is emirp.");
               else
                   System.out.println(a+" is prime.");
           }    
               
       }    
    }
}
class oppsite
{
    StringBuffer sb = new StringBuffer("");
    public String ans(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }        
}
