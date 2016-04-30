
package uva11600_12999;

import java.util.*;
import java.lang.*;

public class uva12250 
{
     public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(System.in);
        String str;
        int a=0;
        while(scanner.hasNext())
        {
            a++;
            str = scanner.next();
            if(str.equals("HELLO"))
            System.out.println("Case "+a+": ENGLISH");
            else if(str.equals("HOLA"))    
            System.out.println("Case "+a+": SPANISH");
            else if(str.equals("HALLO"))
            System.out.println("Case "+a+": GERMAN");
            else if(str.equals("BONJOUR"))
            System.out.println("Case "+a+": FRENCH");
            else if(str.equals("CIAO"))
            System.out.println("Case "+a+": ITALIAN");
            else if(str.equals("ZDRAVSTVUJTE"))
            System.out.println("Case "+a+": RUSSIAN");
            else if(str.equals("#"))
            break;
            else
            System.out.println("Case "+a+": UNKNOWN");    
        }                
    }  
}
