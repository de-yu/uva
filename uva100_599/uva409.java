
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva409 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNextInt())
        {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int sum = 0;
           String ans = "";
           String data[] = new String[a];
           
           for(int i=0;i<a;i++)
               data[i] = scanner.next();
           for(int i=0;i<=b;i++)
           {
               String str = scanner.nextLine();
               ArrayList<String> list = new ArrayList<String>();
               clear(str,list);
               int c = 0;
               for(String s:list)
               {
                   for(int j=0;j<data.length;j++)
                   {
                       if(data[j].equalsIgnoreCase(s))
                       {
                           c++;
                           break;
                       }
                   }
               }               
               if(c==sum)
                   ans = ans + "\n" +str;
               if(c>sum)
               {
                   sum = c;
                   ans = str;
               }
           }
           System.out.println("Excuse Set #"+n);
           System.out.println(ans);
           System.out.println();
           n++;
        }
    }
    public static void clear(String str,ArrayList<String> list)
    {
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<str.length();i++)
        {
            int a = (int)str.charAt(i);
            if((a<=122&&a>=97)||(a>=65&&a<=90)||(a>=48&&a<=57))
                sb.append(str.charAt(i));
            else
            {
                list.add(sb.toString());
                sb = new StringBuffer("");
            }
        }
    }
}
