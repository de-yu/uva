

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10487 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 1;
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==0)
               break;
           int data[] = new int[a];
           for(int i=0;i<a;i++)
               data[i] = scanner.nextInt();
           int b = scanner.nextInt();
           int num[] = new int[b];
           int answer[] = new int[b];
           int diff[] = new int[b];
           for(int i=0;i<b;i++)
           {
               num[i] = scanner.nextInt();
               diff[i] = Integer.MAX_VALUE;
           }
           for(int i=0;i<a;i++)
           {
               for(int j=i+1;j<a;j++)
               {
                  int sum = data[i] + data[j];
                  for(int k=0;k<b;k++)
                  {
                      int d = Math.abs(sum-num[k]);
                      if(d<diff[k])
                      {
                          diff[k] = Math.abs(sum-num[k]);
                          answer[k] = sum;
                      }
                      if(d==diff[k])
                            answer[k] = Math.min(answer[k],sum);
                  }
               }
           }
         
           StringBuilder sb = new StringBuilder("Case "+n+":\n");
           for(int i=0;i<b;i++)
               sb.append("Closest sum to "+num[i]+" is "+answer[i]+".\n");
           System.out.print(sb);
           n++;
       }
    } 
}
