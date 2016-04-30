

package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11349 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int a = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer("");
        for(int i=1;i<=a;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
                s = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            long data[][] = new long[b][b];
            
            for(int j=0;j<b;j++)
            {
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<b;k++)
                    data[j][k] = Long.parseLong(st.nextToken());
            }
            boolean boo = false;
            start:
              for(int j=0;j<b;j++)
              { 
                for(int k=0;k<b;k++)
                { 
                  if(data[j][k]<0L)
                  {        
                      boo = true;
                      break start;
                  }  
                  if(data[j][k]!=data[b-j-1][b-k-1])
                  {        
                      boo = true;
                      break start;
                  }
                }
              }
            if(boo)
               sb.append("Test #"+i+": Non-symmetric.\n");
            else
               sb.append("Test #"+i+": Symmetric.\n");
        }
        System.out.print(sb);
    }
}
