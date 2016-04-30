package uva10600_10999;

import java.math.*;
import java.util.*;

public class uva10929 
{
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        
        BigInteger eleven = new BigInteger("11");
        while(scanner.hasNext())
        {
            String str = scanner.next();
            BigInteger a = new BigInteger(str);
            if(a.equals(BigInteger.ZERO))
                break;
            if(a.remainder(eleven).equals(BigInteger.ZERO))
                System.out.println(str+" is a multiple of 11.");
            else
                System.out.println(str+" is not a multiple of 11.");
        }
    }        
}
