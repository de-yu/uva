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

public class uva10679 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");
        while(n-->0)
        {
            String s = br.readLine();
            int question = Integer.parseInt(br.readLine());
            
            Pattern p;
            Matcher m;
            while(question-->0)
            {
                String q = br.readLine();
                p = Pattern.compile(q);
                m = p.matcher(s);
                
                if(m.find())
                    sb.append("y\n");
                else
                    sb.append("n\n");
            }
        }
        System.out.print(sb);
    }
}
