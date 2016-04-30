

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva445
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           ArrayList<numString> list = new ArrayList<numString>();
           StringBuilder sb = new StringBuilder("");
           String a = "",b = "";
           if(str.length()==0)
           {
               System.out.println();
               continue;
           }
           for(int i=0;i<str.length();i++)
           {
               char c = str.charAt(i);
               if(c=='!')
               {
                   list.add(new numString(0,"\n"));
                   continue;
               }
               if((int)c<=57&&(int)c>=48)
                   a = a + Character.toString(c);
               else
               {
                   b = b + Character.toString(c);
                   list.add(new numString(sum(a),b));
                   a = b = "";
               }
           }
           for(numString ns :list)
           {
               if(ns.str.equals("\n"))
                   sb.append("\n");
               else
               {
                   for(int i=0;i<ns.num;i++)
                   {
                       if(ns.str.equals("b"))
                           sb.append(" ");
                       else
                           sb.append(ns.str);
                   }
               }
           }
           System.out.println(sb);
       }
    }
    public static int sum(String n)
    {
        int sum = 0;
        for(int i=0;i<n.length();i++)
            sum += (int)n.charAt(i) - 48;  
        return sum;
    }
}
class numString
{
    int num = 0;
    String str = "";
    public numString(int a,String b)
    {
        num = a;
        str = b;
    }
}
