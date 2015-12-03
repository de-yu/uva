

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00482 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = Integer.parseInt(br.readLine());
        
        for(int j=0;j<n;j++)
        {
            String space = br.readLine();
            String a = br.readLine();
            String b = br.readLine();
            StringTokenizer c = new StringTokenizer(a);
            StringTokenizer d = new StringTokenizer(b);
            StringBuilder sb = new StringBuilder("");
            String data[] = new String[c.countTokens()+1];
            
            while(c.hasMoreTokens())
            {
                data[Integer.parseInt(c.nextToken())] = d.nextToken();
            }
            
            if(j!=0)
                sb.append("\n");
            for(int i=1;i<data.length;i++)
                sb.append(data[i]+"\n");
            System.out.print(sb);
        }
    }
}
