
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva902 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           String str = scanner.next();
           
           HashMap<String , Integer> map = new HashMap<String ,Integer>();
           String s;
           int max = 0;
           String ans = "";
           for(int i=0;i<=str.length()-a;i++)
           {
               s = (str.substring(i,i+a));
               if(map.get(s)==null)
                   map.put(s, 1);
               else
               {
                   int n = map.get(s);
                   n++;
                   map.put(s,n);
                   if(n>max)
                   {
                       ans = s;
                       max = n;
                   }
               }
           }
           System.out.println(ans);
       }
    }
}
