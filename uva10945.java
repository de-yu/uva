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
public class uva10945 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        StringBuilder ans = new StringBuilder("");
        while(true)
        {
            String str = br.readLine();
            if(str.equals("DONE"))  break;
            
            Pattern p = Pattern.compile("[a-zA-Z]");
            Matcher m = p.matcher(str);
            StringBuilder sb = new StringBuilder("");
            
            while(m.find())
            {
                sb.append(m.group());
            }
            str = sb.toString();
            str = str.toLowerCase();
            if(inspect(str))
                ans.append("You won't be eaten!\n");
            else
                ans.append("Uh oh..\n");
        }
        
        System.out.print(ans);
    } 
    public static boolean inspect(String str)
    {
        boolean boo = true;
        int l = str.length();
        for(int i=0,j=l-1;i<l/2;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                boo = false;
                break;
            }
        }
        
        return boo;
    }
}
