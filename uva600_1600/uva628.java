
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva628
{
    public static void main(String[] args)throws IOException
    {


        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextInt())
        {
            StringBuilder sb = new StringBuilder("");
            int n = scanner.nextInt();
            String data[] = new String[n];
            
            for(int i=0;i<n;i++)
                data[i] = scanner.next();
            
            int m = scanner.nextInt();
            
            for(int i=0;i<m;i++)
            {
                String s = scanner.next();
                for(int j=0;j<n;j++)
                { 
                    temp = new StringBuilder("");
                    password(s , 0 , "" , data[j]);
                    sb.append(temp);
                }
            }
            System.out.print("--\n"+sb);
        }
    }
    static StringBuilder temp;
    public static void password(String s, int p , String before ,String data)
    {
       StringBuilder sb = new StringBuilder("");
       int l = s.length() , j = 0;
       boolean boo = (p==l) , last_n = false;
       
       for(int i=p;i<l;i++)
       {
           if(i==(l-1))
               boo = true;
           if(s.charAt(i)=='0')
           {
               while(j<10)
               {
                    password(s , i+1 , before + sb.toString() + j , data);
                    j++;
               }
               last_n = true;
               break;
           }
           else
               sb.append(data);
       }
       if(boo&&!last_n)
           temp.append(before+sb.toString()+"\n");
    }
}
