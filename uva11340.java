
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11340 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            int a = Integer.parseInt(br.readLine());
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            while(a-->0)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
            }
            int b =  Integer.parseInt(br.readLine());
            double sum = 0;
            while(b-->0)
            {
                String s = br.readLine();
                int l = s.length();
                for(int i=0;i<l;i++)
                {
                    if(map.get(s.charAt(i))!=null)
                        sum+=map.get(s.charAt(i));
                }
            }
            System.out.printf("%.2f$%n",sum/100);
        }
    }
}
