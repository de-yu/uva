/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10323 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        long data[] = new long[14];
        data[0] = data[1] = 1L;
        for(int i=2;i<14;i++)
            data[i] = i*data[i-1];
        while(scanner.hasNextInt())
        {
            int b = scanner.nextInt();
            
             if( b < 0 ){
                 if( b % 2 == 0 ){
                      System.out.println("Underflow!");
                    }
                 else{
                     System.out.println("Overflow!");
                    }
                 continue;
                 }
            
            if(b>13)
                System.out.println("Overflow!");
            else
            {
                if(data[b]<10000)
                    System.out.println("Underflow!");
                else
                    System.out.println(data[b]);
            }
        }    
    }
}
