package uva;

import java.util.*;
import java.math.*;
public class uva10931 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextBigInteger())
        {
            String str = scanner.next();
            if(str.equals("0"))
                break;
            BigInteger a = new BigInteger(str,10);
            String str1 = a.toString(2);
            int b = 0;
            for(int i=0;i<str1.length();i++)
            {
                if(Character.toString(str1.charAt(i)).equals("1"))
                    b++;
            }
            System.out.println("The parity of "+str1+" is "+b+" (mod 2).");
        }    
    }        
}
