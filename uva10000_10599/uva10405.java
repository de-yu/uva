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
public class uva10405 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        while(scanner.hasNextLine())
        {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            
            int data[][] = new int[a.length()+1][b.length()+1];
            
            for(int i=0;i<a.length();i++)
            {
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        data[i+1][j+1] = data[i][j] + 1;
                    }
                    else
                    {
                        data[i+1][j+1] = Math.max(data[i][j+1], data[i+1][j]);
                    }
                }
            }
            System.out.println(data[a.length()][b.length()]);            
        }
    }
    
}
