package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10018 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int a = scanner.nextInt();
       
       for(int i=0;i<a;i++)
       {
           Long b = scanner.nextLong();
           int n = 0;
           inspect s = new inspect();
           do{
              b = s.add(b, Long.toString(b).length());
              n++;
           }while(s.reverse(Long.toString(b)));
           System.out.println(n+" "+b);
       }    
        
    }         
}
class inspect
{
    public boolean reverse(String str)
    {
        if(str.length()==1)
            return false;
        for(int i=0;i<str.length()/2;i++)
        {
            if(!Character.toString(str.charAt(i)).equals(Character.toString(str.charAt(str.length()-i-1))))
                return true;
        }
        return false;
    }
    public Long add(Long num,int length)
    {
        Long sum = num;
        for(int i=0;i<length;i++)
        {
            sum = sum + num%10*(int)Math.pow(10,length-i-1);
            num = num - num%10;
            num = num/10;
        }
        return sum;    
    }        
}
