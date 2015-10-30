
package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00350 
{
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         int n = 1;
         while(scanner.hasNextLong())
         {
             Long a[] = new Long[4];
             for(int i=0;i<4;i++)
                 a[i] = scanner.nextLong();
             if(a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0)
                 break;
             ArrayList<Long> list = new ArrayList<Long>();
             list.add(a[3]);
             boolean h = false;
             for(;;)
             {
                 a[3] = (a[0]*a[3]+a[1])%a[2];
                 list.add(a[3]);
                 for(int i=0;i<list.size()-1;i++)
                 {    
                    if(list.get(list.size()-1)==list.get(i))
                    {
                        System.out.println("Case "+n+": "+(list.size()-1-i));
                        h = true;
                        break;                       
                    }
                 }
                 if(h)
                     break;
             }
             n++;
         }    
    }        
}
