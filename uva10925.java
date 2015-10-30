/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10925 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0)
                break;
            BigInteger sum = BigInteger.ZERO;
            BigInteger bb = BigInteger.valueOf(b);
            for(int i=0;i<a;i++)
                sum = sum.add(scanner.nextBigInteger());
            
            System.out.println("Bill #"+ n +" costs "+ sum +": each friend should pay " + sum.divide(bb) + "\n");
            n++;
        }
    }
}
