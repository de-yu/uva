package uva11000_11599;

import java.util.*;
import java.io.*;
public class uva11586 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int f = 0,m = 0;
            if(st.countTokens()==1)
                System.out.println("NO LOOP");
            else
            {
                int h = st.countTokens();
                for(int k=0;k<h;k++)
                {
                String s = st.nextToken();
                for(int j=0;j<2;j++)
                {
                   if(s.charAt(j)=='F')
                       f++;
                   else
                       m++;
                }
                }
               if(f==m)
                   System.out.println("LOOP");
               else
                   System.out.println("NO LOOP");
            }
        }
    }        
}
