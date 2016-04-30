

package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11946 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(scanner.nextLine());
        char number[] = {'0','1','2','3','4','5','6','7','8','9'};
        char character[] = {'O' , 'I' , 'Z' , 'E' , 'A' , 'S' , 'G' , 'T' , 'B' , 'P'};
        HashMap<Character , Character> map = new HashMap<Character , Character>();
        for(int i=0;i<10;i++)
        {
            map.put(number[i], character[i]);
        }
        StringBuilder sb = new StringBuilder("");
        while(n-->0)
        {
            
            while(scanner.hasNextLine())
            {
                String s = scanner.nextLine();
                if(s.length()==0)
                    break;
                
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)<=57 &&s.charAt(i)>=48)
                        sb.append(map.get(s.charAt(i)));
                    else
                        sb.append(s.charAt(i));
                }
                sb.append("\n");
            }
            if(n!=0)
                sb.append("\n");
        }
        System.out.print(sb);
    }
}
