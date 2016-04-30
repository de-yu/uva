package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11577 
{   
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(br.readLine());
       for(int i=0;i<a;i++)
       {
           String str = br.readLine();
           int data[] = new int[26];
           for(int j=0;j<str.length();j++)
           {
               if((int)str.charAt(j)<123&&(int)str.charAt(j)>96)
                    data[(int)str.charAt(j)-97]++;
               else if((int)str.charAt(j)<=90&&(int)str.charAt(j)>=65)
                   data[(int)str.charAt(j)-65]++;
           }
           int max = 0;
           for(int j=0;j<26;j++)
               max = (data[j]>max?data[j]:max);
           StringBuffer sb = new StringBuffer("");
           for(int j=0;j<26;j++)
           {
               if(data[j]==max)
                   sb.append((char)(j+97));
           }
           System.out.println(sb);
       }               
    }         
}
