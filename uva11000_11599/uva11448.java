package uva11000_11599;

import java.util.*;
import java.math.*;
public class uva11448 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            
            System.out.println(b.add(c.negate()));
        }    
    }        
}
