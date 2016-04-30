
package uva11600_12999;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva11727 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            int b;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j=0;j<3;j++)
            {    
                b = scanner.nextInt();
                 list.add(b);
            }
            Collections.sort(list);
            System.out.println("Case "+i+": "+list.get(1));
        }    
    }
}
