package uva2;

import java.io.*;
import java.util.*;
public class uva11000 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       Long male[] = new Long[46];
       Long all[] = new Long[46];
       Long female[] = new Long[46];
       male[1] = female[1] =1L;
       all[1] = 2L;
       male[0] = 0L;
       all[0] = 1L;
       for(int i=2;i<46;i++)
       {
           male[i] = female[i-1] + male[i-1];
           female[i] = male[i-1] + 1L;
           all[i] = male[i] + female[i];
       }    
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a<0)
               break;
           else
               System.out.println(male[a]+" "+all[a]);
       }    
    }
}
