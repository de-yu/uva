/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10070 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
          BigInteger a = new BigInteger("4");
        BigInteger b = new BigInteger("100");
        BigInteger c = new BigInteger("400");
        BigInteger d = new BigInteger("15");
        BigInteger e = new BigInteger("55");
        BigInteger zero = BigInteger.ZERO;
        int n = 0;
        while(scanner.hasNextBigInteger())
        {
            BigInteger data = scanner.nextBigInteger();
            boolean boo = false;
            boolean bo = false;
            
            if(n!=0)
                System.out.println();
            if(data.mod(a).equals(zero)&&!data.mod(b).equals(zero)||data.mod(c).equals(zero))
            {
                System.out.println("This is leap year.");
                boo = bo = true;
            }
            if(data.mod(d).equals(zero))
            {
                System.out.println("This is huluculu festival year.");
                boo = true;
            }
            if(bo&&data.mod(e).equals(zero))
                System.out.println("This is bulukulu festival year.");
            
            if(!boo)
                System.out.println("This is an ordinary year.");
            n++;
        }
    }        
}
