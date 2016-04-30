
package uva10000_10599;

import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva10038 
{
     public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
       
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             ArrayList<Integer> list = new ArrayList<Integer>();
             ArrayList<Integer> lst = new ArrayList<Integer>();
             boolean c = false;
             for(int i=0;i<a;i++)
             {
                 int b = scanner.nextInt();
                 list.add(b);
             }
             for(int i=0;i<list.size()-1;i++)
                 lst.add(Math.abs(list.get(i)-list.get(i+1)));          
    
             
             for(int i=1;i<=a-1;i++)
             {
                 if(!lst.contains(i))                    
                 {
                     c = true;
                     break;
                 }
             }
             
             if(c)
                 System.out.println("Not jolly");
             else
                 System.out.println("Jolly");
         }    
    }
}
