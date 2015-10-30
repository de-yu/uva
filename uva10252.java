
package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10252 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextLine())
        {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            
            int data[][] = new int[2][26];
            num(data,a,0);
            num(data,b,1);
            
            StringBuffer sb = new StringBuffer("");            
            for(int i=0;i<26;i++)
            {
                int n = Math.min(data[0][i], data[1][i]);
                for(int j=0;j<n;j++)
                {
                    sb.append((char)(i+97));
                }
            }  
            System.out.println(sb);
        }
    }
    public static void num(int data[][],String s,int a)
    {
        for(int i=0;i<s.length();i++)
            data[a][(int)s.charAt(i)-97]++;
        
    }
}
