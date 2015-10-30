
package uva2;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;
public class uva00488 
{
     public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         
         int a = scanner.nextInt();
         StringBuffer sb = new StringBuffer("");
         for(int i=0;i<a;i++)
         {
             int b = scanner.nextInt();
             int c = scanner.nextInt();
             if(i>0)
                 sb.append("\n");
             for(int k=0;k<c;k++)
             {   
                 if(k>0)
                 sb.append("\n");        
                 
                 for(int j=1;j<=b;j++)
                 {
                     for(int p=1;p<=j;p++)
                       sb.append(j);
                     sb.append("\n");
                 }
                 for(int j=b-1;j>=1;j--)
                 {
                     for(int p=1;p<=j;p++)
                        sb.append(j);
                     sb.append("\n");
                 }
                  
             }    
         }
         System.out.print(sb);
    }
}
