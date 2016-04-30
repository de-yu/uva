package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10300 
{ 
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         
         int a = scanner.nextInt();
         
         for(int i=0;i<a;i++)
         {
             Long sum = 0L;
             Long c[] = new Long[3];
             int b = scanner.nextInt();
             for(int j=0;j<b;j++)
             {
                 for(int k=0;k<3;k++)
                     c[k] = scanner.nextLong();
                 sum = sum + c[0]*c[2];
             }
             System.out.println(sum);
         }    
    }        
}
