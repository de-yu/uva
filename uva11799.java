
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11799 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int a = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=a;i++)
        {
            int max = 0;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            
            while(st.hasMoreTokens())
            {
                max = Math.max(max,Integer.parseInt(st.nextToken()));
            }
            System.out.println("Case "+i+": "+max);
        }
    }
}
