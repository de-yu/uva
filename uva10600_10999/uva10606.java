/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10606 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        

       
       while(scanner.hasNext())
       {
         
           String str = scanner.next();
           if(str.equals("0"))
               break;
           int c = str.length()/2 + (str.length()%2==0?-1:0);
           BigInteger left = BigInteger.TEN.pow(c);
           BigInteger right = BigInteger.TEN.pow(c+1);
           BigInteger center = BigInteger.ZERO;
           BigInteger bi = new BigInteger(str);
           while(right.compareTo(left)>=0)
           {
               center = left.add(right).divide(BigInteger.valueOf(2));
               
               if(center.pow(2).compareTo(bi)==1)
                   right = center.subtract(BigInteger.ONE);
               else if(center.pow(2).compareTo(bi)==-1)
                   left = center.add(BigInteger.ONE);
               else break;
           }
           
           if(center.pow(2).compareTo(bi)==1)
               center = center.subtract(BigInteger.ONE);

               System.out.println(center.pow(2));

       }
    
    }
}
