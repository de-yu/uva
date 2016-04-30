
package uva11600_12999;

import java.util.*;

public class uva11764 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        for(int i=1;i<=a;i++)
        {   
            int b = scanner.nextInt();
            int c[] = new int[b];
            int high = 0;
            int low = 0;
            for(int j=0;j<b;j++)
                c[j] = scanner.nextInt();
            for(int j=0;j<b-1;j++)
            {
                if(c[j]>c[j+1])
                    low++;
                if(c[j]<c[j+1])
                    high++;
            }
            System.out.println("Case "+i+": "+high+" "+low);                
        }    
    }        
}
