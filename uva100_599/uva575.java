
package uva100_599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva575 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(str.equals("0"))
                break;
            Long sum = 0L;
            
            for(int i=str.length()-1,j=1;i>=0;i--,j++)
            {
                sum = sum + ((long)Math.pow(2, j)-1)*((long)str.charAt(i)-48);
            }
            System.out.println(sum);
        }
    } 
}
