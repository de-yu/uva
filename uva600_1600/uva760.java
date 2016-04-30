
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva760 
{
    public static void main(String[] args)throws IOException
    {


        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               

        int n = 0;
        while(scanner.hasNext())
        {
            String a = scanner.next(),
                    b = scanner.next();
            int length = b.length();
            StringBuilder sb = new StringBuilder("");
            ArrayList<String> list = new ArrayList<String>();
            Pattern p;
            Matcher m;
            for(int i=Math.max(a.length() , length);i>0;i--)
            {
                boolean ans = false;
                for(int j=0;j<=length-i;j++)
                {
                    String s = b.substring(j, j+i);
                    p = Pattern.compile(s);
                    m = p.matcher(a);
                    
                    if(m.find())
                    {
                        list.add(s+"\n");
                        ans = true;
                    }
                }
                if(ans)
                    break;
            }
            if(n!=0)
                System.out.println();
            if(list.size()==0)
                System.out.println("No common sequence.");
            else              
            {
                Collections.sort(list);
                String before = "";
                for(String s:list)
                {
                    if(s.equals(before))
                        continue;
                    sb.append(s);
                    before = s;
                }
                System.out.print(sb);
            }
            n = 1;
        }
    }
}
