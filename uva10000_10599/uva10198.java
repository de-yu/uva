/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10198 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       BigInteger num[] = new BigInteger[1001];
       num[1] = BigInteger.valueOf(2);
       num[2] = BigInteger.valueOf(5);
       num[3] = BigInteger.valueOf(13);
       
       for(int i=4;i<1001;i++)
       {
           num[i] = num[i-1].multiply(BigInteger.valueOf(2)).add(num[i-2]).add(num[i-3]);
       }
       
       StringBuilder sb = new StringBuilder("");
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           sb.append(num[a]+"\n");
           
       }
       System.out.print(sb);
    }
}
