package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva516 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           if(str.equals("0"))
               break;
           String s[] = str.split(" ");
           int sum = 1;
           for(int i=0;i<s.length;i+=2)
               sum = sum * (int)Math.pow(Integer.parseInt(s[i]),Integer.parseInt(s[i+1]));
           Factorization f = new Factorization();
           System.out.println(f.answer(sum-1));
       }    
    }         
}
class Factorization 
{        
         public String answer(int a)
         {
             int b = a;
             String ans = "";
             int num = 1;
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
                        num++; 
                     }
                     if(num>=1)
                     {    
                        ans = i+" "+num + ans;
                        num = 1;
                     }
                     else
                         ans = ans + i;
                         ans = " "+ ans;
                 }
              }
                return ans.substring(1,ans.length());
         }
}
