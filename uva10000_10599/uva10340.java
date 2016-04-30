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
public class uva10340 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNext())
        {
            String a = scanner.next();
            String b = scanner.next();
            int before = 0,sum = 0;
            for(int i=0;i<a.length();i++)
            {
                char c = a.charAt(i);
                for(int j=before;j<b.length();j++)
                {
                    if(c==b.charAt(j))
                    {
                        before = j+1;
                        sum++;
                        break;
                    }
                }
            }
            if(sum==a.length())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    } 
}
