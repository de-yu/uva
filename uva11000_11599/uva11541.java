
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;

public class uva11541 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        
        for(int i=1;i<=n;i++)
        {
            String s = scanner.next() + "x";
            String a = "";
            String b = "";
            sb.append("Case "+i+": ");
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)>=65)
                {
                    if(!b.equals("") || s.charAt(j)=='x')
                    {
                        int sum = Integer.parseInt(b);                  
                        for(int k=0;k<sum;k++)
                            sb.append(a);
                        b = "";
                    }
                    a = Character.toString(s.charAt(j));
                }
                else
                {
                    b = b + Character.toString(s.charAt(j));
                }
            }
            sb.append("\n");
        } 
        System.out.print(sb);
    }
}
