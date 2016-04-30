package uva10000_10599;

import java.util.*;

public class uva10346 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 0;
            int ans = 0;                
            do
            {
                ans = ans + a;
                c = c + a;
                a = c/b;
                c = c%b;
            }while(a!=0);
            
                System.out.println(ans);
        }    
        
    }        
}
