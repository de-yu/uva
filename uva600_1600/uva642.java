
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva642 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        String s;
        ArrayList<alphabet> list = new ArrayList<alphabet>();
        ArrayList<String> word = new ArrayList<String>();
        while(scanner.hasNext())
        {
            s = scanner.next();
            if(s.equals("XXXXXX"))
                break;
            list.add(new alphabet(s));
            word.add(s);
        }
        
        StringBuilder sb = new StringBuilder("");
        int size = word.size();
        
        while(scanner.hasNext())
        {
            s = scanner.next();
            boolean ansHave = false;
            ArrayList<String> answer = new ArrayList<String>();
            if(s.equals("XXXXXX"))
                break;
            
            alphabet b = new alphabet(s);
            
            for(int i=0;i<size;i++)
            {
                if(list.get(i).equals(b))
                {
                    answer.add(word.get(i));
                    ansHave = true;
                }
            }
            Collections.sort(answer);
            for(String str:answer)
            {
                sb.append(str+"\n");
            }
            
            if(!ansHave)
                sb.append("NOT A VALID WORD\n");
            sb.append("******\n");
        }
        
        System.out.print(sb);
    }
}
class alphabet
{
    int c[] = new int[26];
    public alphabet(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-97]++;
        }
    }
    public boolean equals(alphabet a)
    {
        boolean equal = true;
        
        for(int i=0;i<26;i++)
        {
            if(a.c[i]!=c[i])
            {
                equal = false;
                break;
            }
        }
        
        return equal;
    }
}
