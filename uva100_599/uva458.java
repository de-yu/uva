package uva100_599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva458 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            int a = 0;
            for(int i=0;i<str.length();i++)
            {    
                a = str.charAt(i)-7;
                System.out.print((char)a);
            }
            System.out.println();
                
        }
        
    }
}
