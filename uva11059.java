

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11059 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
     int n = 0;
      while(scanner.hasNextInt())
      {
          int a = scanner.nextInt();
          Long data[] = new Long[a];
          Long max = 0L;
          
          for(int i=0;i<a;i++)
              data[i] = scanner.nextLong();
          
          for(int i=0;i<a;i++)
          {
              Long bi = data[i];
              if(bi>max)
                      max = bi;
              for(int j=i+1;j<a;j++)
              {
                  bi = bi*data[j];
                  if(bi>max)
                      max = bi;
              }
          }
          System.out.printf("Case #%d",++n);
          System.out.println(": The maximum product is "+max+".\n");
      }
    }
}
