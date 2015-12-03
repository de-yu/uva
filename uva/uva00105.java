
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00105 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int data[] = new int[10001];
        int min = 10000 , max = 0 , height = 0;
        StringBuilder sb = new StringBuilder("");
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt()
                    ,b = scanner.nextInt()
                        ,c = scanner.nextInt();
            min = Math.min(min , a);
            max = Math.max(max , c);
            
            for(int i=a;i<c;i++)
                data[i] = Math.max(data[i], b);
        }
        
        for(int i=min;i<=max+1;i++)
        {
            if(data[i] != height)
            {
                height = data[i];
                sb.append(" "+i+" "+height);
            }
        }
        System.out.println(sb.deleteCharAt(0));
    }
}
