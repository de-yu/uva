package uva10000_10599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva10473 
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext())
        {
            String str = scanner.next();
            int a = 0;
            if(Character.toString(str.charAt(0)).equals("-"))
                break;
            
            if(!Character.toString(str.charAt(0)).equals("0"))
            {    
               a = Integer.parseInt(str);
               System.out.println("0x"+Integer.toString(a,16).toUpperCase());
            }
            else if(Character.toString(str.charAt(1)).equals("x"))
            {
                a = Integer.parseInt(str.substring(2,str.length()),16);
                System.out.println(Integer.toString(a,10));
            }                         
        }                    
    }       
}
