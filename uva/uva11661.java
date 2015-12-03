

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11661 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(true)
        {
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                break;
            String str = br.readLine();
            int min = Integer.MAX_VALUE;
            int r = -1,d = -1;
            for(int i=0;i<a;i++)
            {
                char c = str.charAt(i);
                if(c=='R'||c=='D')
                {
                   if(d!=-1&&r!=-1)
                        min = Math.min(min,Math.abs(r-d));
                    if(c=='R') 
                        r = i;
                    else 
                        d = i;
                    if(d!=-1&&r!=-1)
                        min = Math.min(min,Math.abs(r-d));
                }
                if(c=='Z')
                {
                    min = 0;
                    break;
                }
            }
            System.out.println(min);
        }
    } 
}
