

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva444 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       String data[] = new String[128];
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       int cc[] = {32,33,44,46,58,59,63};
       for(int i=65;i<91;i++)
       {
           data[i] = reverse(Integer.toString(i));
           map.put(i,1);
       }
       for(int i=97;i<123;i++)
       {
           data[i] = reverse(Integer.toString(i));
           map.put(i,1);
       }
        for(int i=0;i<7;i++)
       {
           data[cc[i]] = reverse(Integer.toString(cc[i]));
           map.put(cc[i],1);
       }
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           if(str.length()==0)
           {
               System.out.println();
               continue;
           }
           StringBuilder sb = new StringBuilder("");
           if(str.charAt(0)>=48&&str.charAt(0)<=57)
           {
               StringBuilder s = new StringBuilder("");
               for(int i=str.length()-1;i>=0;i--)
               {
                   s.append(str.charAt(i));
                   if(s.length()>=2)
                   {
                       if(map.get(Integer.parseInt(s.toString()))!=null)
                       {
                           char c = (char)Integer.parseInt(s.toString());
                           sb.append(c);              
                           s = new StringBuilder("");
                       }
                   }
               }
           }
           else
           {
               for(int i=str.length()-1;i>=0;i--)
                   sb.append(data[(int)str.charAt(i)]);
           }
           System.out.println(sb);
       }
    }
    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++)
                sb.insert(0, s.charAt(i));
        return sb.toString();
    }
}
