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
public class uva10696 
{
      public static void main(String[] args)throws IOException
    {
          Scanner scanner = new Scanner(System.in);
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuffer sb = new StringBuffer("");
        while(true)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            if(a==0)
                break;
            if(a>=101)
               sb.append("f91"+"("+a+") = "+(a-10)+"\n");
            else
              sb.append("f91"+"("+a+") = 91\n");
        }
        System.out.print(sb);
    }
}
