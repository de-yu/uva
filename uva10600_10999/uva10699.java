package uva10600_10999;

import uva100_599.Factorization;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10699 
{ 
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         
         Factorization f = new Factorization();
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             if(a==0)
                 break;
             System.out.println(a+" : "+f.answer(a));
         }    
         
    }        
}
class Factorization 
{        
         public int answer(int a)
         {
             int b = a;
             String ans = "";
             int num = 0;
             for(int i=2;i<=b;i++)
             {  
                 if(a<i)
                     break;
                 if(a%i==0)
                 {  
                     a = a/i;
                     while(a%i==0)
                     {
                        a = a/i;

                     }
                     num++;
                 }
              
            }
             return num;
         }
}
