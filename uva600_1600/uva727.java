
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva727 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
         int a = Integer.parseInt(scanner.nextLine());
         String aa = scanner.nextLine();
       for(int i=0;i<a;i++)
       {
            ArrayList<String> data = new ArrayList<String>();
            ArrayList<String> answer = new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            int c = 0;
            while(scanner.hasNextLine())
            {
                String str = scanner.nextLine();

                if(str.length()==0)         break;
                data.add(str);
            }          
             data.add("#");
             postfix(data,answer);
             if(i!=0)
                 System.out.println();
             for(String s:answer)
             {
                 sb.append(s);
             }
             System.out.println(sb);
       }
    }
    public static void postfix(ArrayList<String> data,ArrayList<String> answer)
    {
        Stack<String> s = new Stack<String>();
        Hashtable<String,Integer> table = new Hashtable<String,Integer>();
        s.add("#");
        table.put("*",2);
        table.put("/",2);
        table.put("+",1);
        table.put("-",1);
        table.put("(",0);
        table.put("#",0);
        for(String str:data)
        {
            if(str.equals("#"))
            {
                s.remove(0);
                while(!s.isEmpty())
                {
                    answer.add(s.pop());
                }
            }
            else if(str.equals("("))
                s.add(str);
            else if(str.equals(")"))
            {
                while(!s.peek().equals("("))
                {
                    answer.add(s.pop());
                }
                s.pop();
            }
            else if(str.equals("*")||str.equals("/")||str.equals("+")||str.equals("-"))
            {
                    while(table.get(str)<=table.get(s.peek()))
                    {
                        answer.add(s.pop());            
                    }
                    if(table.get(str)>table.get(s.peek()))
                    {
                        s.add(str);
                    }
            }
            else
            {
                answer.add(str);
            }
        }
    }
}
