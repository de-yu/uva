package uva2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10878 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           StringBuffer sb = new StringBuffer("");
           if(str.equals("___________"))
           {
               while(scanner.hasNextLine())
               {
                   str = scanner.nextLine();
                   if(str.equals("___________"))
                       break;
                   String s = "";
                   for(int i=0;i<str.length();i++)
                   {
                       if(str.charAt(i)==' ')
                           s = s + "0";
                       else if(str.charAt(i)=='o')
                           s = s + "1";
                   }
                   sb.append((char)Integer.parseInt(s,2));
               }    
           }
           System.out.print(sb);
       }    
    }
}
