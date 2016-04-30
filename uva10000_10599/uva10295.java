
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10295 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String num[] = tokenizer(br.readLine());
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        StringBuilder sb = new StringBuilder("");

        int a = Integer.parseInt(num[0])
                , b = Integer.parseInt(num[1]);

        for(int i=0;i<a;i++)
        {
            String money[] = tokenizer(br.readLine());
            map.put(money[0] , Integer.parseInt(money[1]));
        }
        
        for(int i=0;i<b;i++)
        {
            int sum = 0;
            String in = br.readLine();
            StringBuilder s = new StringBuilder("");
            
            while(!in.equals("."))
            {
                s.append(" "+in);
                in = br.readLine();
            }
            String str[] = tokenizer(s.toString());
            for(String c:str)
            {
                if(map.get(c)!=null)
                    sum += map.get(c);
            }
            
            sb.append(sum+"\n");
        }
        System.out.print(sb);
        
    }
    public static String[] tokenizer(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        String str[] = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens())
        {
            str[i++] = st.nextToken();
        }
        
        return str;
    }
}
