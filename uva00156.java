

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00156 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String str = "";
        ArrayList<String> list = new ArrayList<String>();
        while(true)
        {
            String s = br.readLine();
            if(s.equals("#"))
                break;
            str = str + " " +s;
        }
        StringTokenizer st = new StringTokenizer(str);
        String data[] = new String[st.countTokens()];
        int a = st.countTokens();
        for(int i=0;i<a;i++)
            data[i] = st.nextToken();
        
        for(int i=0;i<data.length;i++)
        {
            boolean boo = false;
            for(int j=i+1;j<data.length;j++)
            {
                if(data[i].length()==data[j].length())
                    if(match(data[i].toLowerCase(),data[j].toLowerCase()))
                    {
                        data[j] = "";
                        boo = true;
                    }
            }
            if(boo)
                data[i] = "";
        }
        for(int i=0;i<data.length;i++)
        {
            if(!data[i].equals(""))
                list.add(data[i]);
        }
        Collections.sort(list);
        
        for(String s:list)
        {
            System.out.println(s);
        }
            
    }
    public static boolean match(String a,String b)
    {
        boolean boo = true;
       int num[][] = new int[2][26];
       for(int i=0;i<a.length();i++)
           num[0][(int)a.charAt(i)-97]++;
       for(int i=0;i<b.length();i++)
           num[1][(int)b.charAt(i)-97]++;
       
       for(int i=0;i<26;i++)
       {
           if(num[0][i]!=num[1][i])
               boo = false;
       }
       return boo;
    }
}
