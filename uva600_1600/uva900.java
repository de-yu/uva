package uva600_1600;

import java.io.*;
import java.util.*;
public class uva900 
{
     public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         Long b[][] = new Long[3][51];
            b[0][0] = 0L;
            b[1][0] = 1L;
         for(int i=0;i<50;i++)   
         {
             b[2][i] = b[0][i] + b[1][i];
             b[0][i+1] = b[1][i];
             b[1][i+1] = b[2][i];
         }
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             if(a==0)
                 break;
             System.out.println(b[2][a-1]);          
         }                               
    }
}
