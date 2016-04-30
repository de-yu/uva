

package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva1584 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            String a = scanner.next();
            int l =a.length();
            String data[] = new String[a.length()];
            
            for(int i=0;i<l;i++)
            {
                data[i] = a.substring(i,l) + a.substring(0,i);
            }
            Arrays.sort(data);
            System.out.println(data[0]);
        }
    }
}
