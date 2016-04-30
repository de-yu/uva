/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;

public class uva10706 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long data[] = new long[31269];
        int length = 0;
        for(int i=1;;i++)
        {
            data[i] = data[i-1] + Integer.toString(i).length() + length;
            length = length + Integer.toString(i).length();
            
            if(data[i]>Integer.MAX_VALUE)
                break;
        }
        int n = scanner.nextInt();
        while(n-->0)
        {
            int a,b;
            a = b = scanner.nextInt();

            int position = -1;
            while(position<0)
            {
                position = Arrays.binarySearch(data, --b); 
            }
            
            int sum = 0;
            a = a - (int)data[position];

            for(int i=1;;i++)
            {
                int l =  Integer.toString(i).length();
                sum = sum + l;
                if(sum>=a)
                {
                    System.out.println(Integer.toString(i).charAt(a-(sum-l)-1));
                    break;
                }
            }
            
        }
    }
}
