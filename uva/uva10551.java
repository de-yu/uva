
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10551 
{
    public static void main(String[] args)throws IOException
    {


        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int base;
        while((base = scanner.nextInt())!=0)
        {
            String a = scanner.next(),
                    b = scanner.next();
            
            BigInteger c = new BigInteger(a , base);
            BigInteger d = new BigInteger(b , base);
            
            c = c.mod(d);
            
            System.out.println(c.toString(base));
        }
    }
}
