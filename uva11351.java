package uva;

import java.util.*;

public class uva11351 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = 0;
            List list = new ArrayList();
            for(int j=1;j<=b;j++)
                list.add(j);
            
           
            for(int j=1;j<b;j++)
            {
                d = d + c-1;
                while(d>=list.size())
                    d = d - list.size();
                list.remove(d);
            }
            Iterator it = list.iterator();
            while(it.hasNext())
                System.out.println("Case "+i+": "+it.next());
        }    
    }            
}
