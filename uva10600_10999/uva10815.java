/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10815 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String str;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        TreeSet<String> set = new TreeSet<String>();
        while(br.ready())
        {
            str = br.readLine();
            str = str.replaceAll("[^\\p{Alpha}]"," ");
            st = new StringTokenizer(str);
            while(st.hasMoreTokens())
            {
                set.add(st.nextToken().toLowerCase()+"\n");
            }
        }
        for(String s:set)
        {
            if(s.equals("EOF"))
                continue;
            sb.append(s);
        }
        System.out.print(sb);
    } 
}
