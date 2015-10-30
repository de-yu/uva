
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00324 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int data[][] = new int[367][10];
        data[1][1] = 1;
        
        BigInteger one = BigInteger.ONE;
        
        for(int i=2;i<367;i++)
        {
            one = one.multiply(BigInteger.valueOf(i));
            String s = one.toString();
            
            for(int j=0;j<s.length();j++)
            {
                data[i][s.charAt(j)-48]++;
            }
        }

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                 break;
            StringBuilder sb = new StringBuilder(a+"! --\n");
            
            for(int i=0;i<10;i++)
            {
                Formatter fm = new Formatter();
                fm.format("   (%d)%5d", i , data[a][i]);
                sb.append(fm.toString());
                if(i==4)
                    sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
