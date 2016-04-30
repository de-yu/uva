package uva11000_11599;

import java.io.*;
import java.util.*;
public class uva11398 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       start:
       while(scanner.hasNext())
       {
           ArrayList<String> list = new ArrayList<String>();
           while(scanner.hasNext())
           {
               String str = scanner.next();
               if(str.equals("#"))
                   break;
               if(str.equals("~"))
                   break start;
               list.add(str);
           }
           String str = "";
           int flag = 0;
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).equals("0"))
                  flag = 1;              
               else if(list.get(i).equals("00"))
                  flag = 0;
               else
               {
                   int b = list.get(i).length()-2;
                   for(int j=0;j<b;j++)
                       str = str + flag;
               }
           }
           if(str.equals(""))
               System.out.println("0");
           else
           {
             int a = Integer.parseInt(str,2);
             System.out.println(a);
           }
       }    
    }     
}
