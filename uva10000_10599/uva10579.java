

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10579 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger data[] = new BigInteger[5000];
        data[1] = data[2] = BigInteger.ONE;
        
        for(int i=3;i<5000;i++)
            data[i] = data[i-1].add(data[i-2]);
        
        StringBuilder sb = new StringBuilder("");
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            sb.append(data[a]+"\n");
        }
        System.out.print(sb);
    }
}
