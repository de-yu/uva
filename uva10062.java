package uva2;

import java.io.*;
import java.util.*;
public class uva10062 
{
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         
          int n = 0;
         while(scanner.hasNext())
         {
             TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
             String str = scanner.nextLine();
             if(str.equals(""))
             {
                 System.out.println();
                 continue;
             }
             for(int i=0;i<str.length();i++)
             {
                 if(map.get((int)str.charAt(i))==null)
                     map.put((int)str.charAt(i), 1);
                 else
                      map.put((int)str.charAt(i), map.get((int)str.charAt(i))+1);
             }
             if(n>=1)
             System.out.println();
             for(int j=1;j<=str.length();j++)
             {
                for(int i=150;i>=0;i--)
                {
                    if(map.get(i)==null)
                         continue;
                    if(map.get(i)==j)
                        System.out.println(i+" "+map.get(i));
                }
             }
            n++;  
         }
    }
}
