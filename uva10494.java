

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10494 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextLine())
        {
            StringTokenizer st = new StringTokenizer(scanner.nextLine()); 
            BigInteger a = new BigInteger(st.nextToken());
            String s = st.nextToken();
            BigInteger b = new BigInteger(st.nextToken());
            
            if(s.equals("/"))
                System.out.println(a.divide(b));
            else
                System.out.println(a.mod(b));
        }
    } 
}
