package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva591 
{ 
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int n = 1;
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             if(a==0)
                 break;
             int b[] = new int[a];
             int average = 0;
             for(int i=0;i<a;i++)
             {
                 b[i] = scanner.nextInt();
                 average += b[i];
             }
             average = average/a;
             int ans = 0;
             for(int i=0;i<a;i++)
                 ans = ans + (b[i]>average?b[i]-average:0);         
             if(n>1)
                 System.out.println();

             System.out.println("Set #"+n);
             System.out.println("The minimum number of moves is "+ans+".");
             n++;
         }    
    }
}
