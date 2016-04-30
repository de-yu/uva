package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva756 
{ 
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int c[] = new int[3];
           c[0] = 924*6;
           c[1] = 759*19;
           c[2] = 644*2;
           int b = 21252;
           int d[] = new int[3];
           d[0] = 23;
           d[1] = 28;
           d[2] = 33;
           int n = 1;
       while(scanner.hasNextInt())
       {
           
           int a[] = new int[4];
           boolean boo = true;
           for(int i=0;i<3;i++)
           {    
               a[i] = scanner.nextInt();
               a[i] = a[i]%d[i];
               if(a[i]!=-1)
                   boo = false;
           }
           a[3] = scanner.nextInt();
           if(boo)
               break;
           int s = 0;
           for(int i=0;i<3;i++)
                s = s + a[i]*c[i];
           s = s%b;
           if(s==0||s-a[3]<0)
               s = s+b-a[3];
           else
               s = s - a[3];
           System.out.println("Case "+n+": the next triple peak occurs in "+s+" days.");
           n++;
       }
    }   
}
