package uva;

//輸入兩個數相減

import java.util.*;
import static java.lang.Math.*;

public class uva10055 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long a;
        long b;  
        while(scanner.hasNextLong())
        {
           a = scanner.nextLong();
           b = scanner.nextLong();
           System.out.println(abs(a-b));
        }   
    }        
}
