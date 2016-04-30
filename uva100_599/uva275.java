

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva275 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           StringBuilder sb = new StringBuilder(".");
           int sum = 1;
           int show[] = new int[1001];
           show[a] = 1;
           if(b==0)
               break;
           if(a==0)
           {
               System.out.println(".\nThis expansion terminates.\n");
               continue;
           }
           while(true)
           {
               if(sum%50==0)
                   sb.append("\n");
               sb.append(a*10/b);
               a = a*10%b;
               sum++;
               if(a==0)
                   break;
               if(show[a]>0)
                   break;
               show[a] = sum;
           }
           if(a==0)
               System.out.println(sb+"\nThis expansion terminates.\n");
           else
               System.out.println(sb+"\nThe last "+(sum-show[a])+" digits repeat forever.\n");
       }
    }
}
