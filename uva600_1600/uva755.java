
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva755 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String data[] = {"2","2","2","3","3","3","4","4","4","5","5","5","6","6","6","7","0","7","7","8","8","8","9","9","9"};
        
        int n = scanner.nextInt();
        
        for(int k=0;k<n;k++)
        {
            int a = scanner.nextInt();
            
            HashMap<String , Integer> map = new HashMap<String , Integer>();
            String ans[] = new String[a];
            for(int l=0;l<a;l++)
            {
                String s = scanner.next();
                StringBuilder sb = new StringBuilder("");
            
                for(int i=0;i<s.length();i++)
                {
                    if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
                        sb.append(data[s.charAt(i)-65]);
                    else if(s.charAt(i)>=48&&s.charAt(i)<=57)
                        sb.append(s.charAt(i));
                }
                String str = sb.toString();
                
                if(map.get(str)==null)
                    map.put(str , 1);
                else
                {
                        int i = map.get(str);
                        map.put(str , i+1);
                }
                ans[l] = str;
            }
            
            Arrays.sort(ans);
            
            StringBuilder out = new StringBuilder("");
            for(int i=0;i<a;i++)
            {
                if(map.get(ans[i])>1)
                {
                    out.append(ans[i].substring(0, 3)+"-"+ans[i].substring(3,7)+" "+map.get(ans[i])+"\n");
                    map.put(ans[i], 0);
                }
            }
            if(k!=0)
                System.out.println();
            if(out.length()>0)
                System.out.print(out);
            else
                System.out.println("No duplicates.");
        }
    }
}
