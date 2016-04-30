package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10079 
{ 
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
         while(scanner.hasNextLong())
         {
             Long one = 2L;
             Long a = scanner.nextLong();
             if(a<0)
                 break;
             System.out.println(one + (a+2)*(a-1)/2);
         }    
             
    }        
}
