

package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class uva11687 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(str.equals("END"))
                break;
           int sum = 1;
           int length = str.length();
           
           while(!Integer.toString(length).equals(str))
           {
               str = Integer.toString(length);  
               length = str.length();
               sum++;
           }
           System.out.println(sum);
        }
    }
}
