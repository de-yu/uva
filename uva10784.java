/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10784 
{
        public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = 1;
        while(scanner.hasNextLong())
        {
            long a = scanner.nextLong();
            if(a==0L)
                break;
            long b = (long)(3+(long)Math.sqrt(9+8*a))/2;
            if((b*(b-3))/2>=a)
                System.out.printf("Case %d: %d%n",n++,b);
            else
                System.out.printf("Case %d: %d%n",n++,b+1);
        }
    }
}
