

package uva;

import java.util.*;

public class uva11150 
{
     public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextInt())
        {
           
            int a = scanner.nextInt();
            int b = 3;
            int c = 0;
            int ans = 0;                
            do
            {
                ans = ans + a;
                c = c + a;
                a = c/b;
                c = c%b;
            }while(a!=0);
            
            if(c==2)
                System.out.println(ans+1);
            else
                System.out.println(ans);
        }    
        
    }
}
