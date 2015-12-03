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
public class uva12403 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int a = scanner.nextInt();
        int sum = 0;
        while(a-->0)
        {
            String b = scanner.next();
            if(b.equals("report"))
            {
                System.out.println(sum);
            }
            else
            {
                int c = scanner.nextInt();
                sum = sum + c;
            }
        }
    }
}
