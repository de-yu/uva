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
public class uva00713 
{
    
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
      int a = scanner.nextInt();
      
      for(int i=0;i<a;i++)
      {
          String b = scanner.next();
          String c = scanner.next();
          BigInteger bi = new BigInteger(reverse(b));
          bi = bi.add(new BigInteger(reverse(c)));
          String s = reverse(bi.toString());
          System.out.println(new BigInteger(s));

      }    
    }
    public static String reverse(String str)
    {
        StringBuffer sb = new StringBuffer("");  
        for(int i=str.length()-1;i>=0;i--)
            sb.append(str.charAt(i));
                    
        return sb.toString();
    }
}
