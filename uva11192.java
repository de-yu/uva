
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11192 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNext())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            String str = scanner.next();
            StringBuilder sb = new StringBuilder("");
            Pattern p = Pattern.compile("[\\w]{"+str.length()/a+"}");
            Matcher m = p.matcher(str);
            
            while(m.find())
            {
                for(int i=m.group().length()-1;i>=0;i--)
                    sb.append(m.group().charAt(i));
            }
            System.out.println(sb);
        }
    }
}
