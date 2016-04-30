
package uva11000_11599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva11479 
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            ArrayList<Long> list = new ArrayList<Long>();
            for(int j=0;j<3;j++)
                list.add(scanner.nextLong());
            Collections.sort(list);
            
            Long b = list.get(0);
            Long c = list.get(1);
            Long d = list.get(2);
            
            yes_no n = new yes_no();
            boolean e = n.triangle(b, c, d);
            
            
            if(e)
                System.out.println("Case "+i+": Invalid");           
            else if(b.equals(c)&&c.equals(d))
                System.out.println("Case "+i+": Equilateral");
            else if(b.equals(c)||c.equals(d))
                System.out.println("Case "+i+": Isosceles");
            else  
                System.out.println("Case "+i+": Scalene");
        }    
    }       
}
class yes_no
{
    public boolean triangle(Long a,Long b,Long c)
    {
        if((a+b)>c&&(b+c)>a&&(a+c)>b)       
           return false;
        else
           return true;               
    }          
}

