
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva12372 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");
        for(int i=1;i<=a;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean boo = false;
            
            while(st.hasMoreTokens())
            {
                if(Integer.parseInt(st.nextToken())>20)
                    boo = true;
            }
            if(boo)
                sb.append("Case "+i+": bad\n");
            else
                sb.append("Case "+i+": good\n");
        }
        System.out.print(sb);
    }
}
