

package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11494 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
         StringBuffer sb = new StringBuffer(""); 
         while(true)
         {    
            String str = br.readLine();
             StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            if(a==0&&b==0&&e==0&&f==0)
                break;
           
            if(a==e&&b==f)
                sb.append("0\n");
            else if((a==e||b==f)||(Math.abs(a-e)==Math.abs(b-f)))
                   sb.append("1\n");
            else
                sb.append("2\n");
         }
         System.out.print(sb);
    }
}
