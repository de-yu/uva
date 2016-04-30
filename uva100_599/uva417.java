package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva417 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       char data[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       ArrayList<String> list[] = new ArrayList[5];
       for(int i=0;i<5;i++)
           list[i] = new ArrayList<String>();
       for(char c='a';c<='z';c++)
           list[0].add(Character.toString(c));
       for(int i=1;i<5;i++)
       {
           for(String s:list[i-1])
           {
               char n = s.charAt(s.length()-1);
               for(int j=0;j<26;j++)
               {
                   if(n<data[j])
                       list[i].add(s+Character.toString(data[j]));
               }
           }               
       }
       HashMap<String,Integer> map = new HashMap<String,Integer>();
       int n = 1;
       for(int i=0;i<5;i++)
       {
           for(String s:list[i]){
               map.put(s, n);
               n++;
                       }
       }
       while(scanner.hasNext())
       {
           String str = scanner.next();
           if(map.get(str)==null)
               System.out.println("0");
           else
           System.out.println(map.get(str));
       }
    }
}
