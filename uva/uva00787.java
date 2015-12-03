

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00787 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       while(scanner.hasNextLine())
       {
           StringTokenizer st = new StringTokenizer(scanner.nextLine());
           int length = st.countTokens();
           BigInteger bi = BigInteger.ONE;
           BigInteger max = BigInteger.valueOf(-100000);
           BigInteger before = BigInteger.ZERO;
           BigInteger data[] = new BigInteger[length-1];
           for(int i=0;i<length-1;i++)
               data[i] = new BigInteger(st.nextToken());
           for(int i=0;i<length-1;i++)
           {
               bi = data[i];
               max = max.max(bi);
               for(int j=i+1;j<length-1;j++)
               {
                   bi = bi.multiply(data[j]);
                   max = max.max(bi);
               }
           }
           System.out.println(max);
           
       }
    } 
}
