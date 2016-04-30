package uva600_1600;

import java.io.*;
import java.util.*;
public class uva674 
{
      public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         int n[] = {10,25,50};
         Long data[] = new Long[6002];
         data[0] = 0L;
         data[1] = 1L;
         for(int i=2;i<6002;i++)
             data[i] = data[i-1] + 1;
         for(int i=0;i<3;i++)
         {
             for(int j=n[i]/5;j<6002;j++)
                 data[j] = data[j] + data[j-n[i]/5];
         }    
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             System.out.println(data[a/5+1]);
         }    
    } 
}
