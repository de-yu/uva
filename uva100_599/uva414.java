
package uva100_599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva414 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       while(true)
       {
           int a = Integer.parseInt(br.readLine());
           if(a==0)
               break;
           int space[] = new int[a];
           int min = 25;
           for(int i=0;i<a;i++)
           {
               String s = br.readLine();
               int m = 0;
               for(int j=0;j<25;j++)
               {
                   if((int)s.charAt(j)==32)
                       m++;
               }
               space[i] = m;
               min = Math.min(m, min);
           }
           int sum = 0;
           for(int i=0;i<a;i++)
               sum = sum + space[i] - min;
           System.out.println(sum);
       }
    }
}
