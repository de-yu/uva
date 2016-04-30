/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11000_11599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11309 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            String str = scanner.next();
            String data = str.substring(0, 2) + str.substring(3,5);
            int b = Integer.parseInt(data);
            
            for(;;)
            {
                b++;
                if(b%100==60)
                {
                    b+=100;
                    b = b - b%100;
                }
                if(b/100==24)
                    b = 0;
                String s = Integer.toString(b);
                if(inspect(s))
                {
                    while(s.length()!=4)
                    {
                        s = "0"+s;
                    }
                    System.out.println(s.substring(0, 2)+":"+s.substring(2, 4));
                    break;
                }                  
            }
        }
    }
    public static boolean inspect(String data)
    {
        boolean yes = true;
        int a = data.length()/2-1;
        for(int i=0;i<=a;i++)
        {  
            if(data.charAt(i)!=data.charAt(data.length()-i-1))
            {
                yes = false;
                break;
            }
        }
        return yes;
    }
}
