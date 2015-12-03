
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11401 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long data[] = new long[1000001];
        long a = 1
            ,b = 0;
        
        for(int i=3;i<1000001;i+=2)
        {
            data[i] = a*b;
            data[i+1] = data[i] + a;
            a++;
            b++;
        }
        for(int i=4;i<1000001;i++)
        {
            data[i] = data[i] + data[i-1];
        }
        StringBuilder sb = new StringBuilder("");
        int n ;
        while((n = scanner.nextInt())>=3)
        {
            sb.append(data[n]+"\n");
        }
        System.out.print(sb);
    }
}
