

package uva2;
//插入排序法
import java.io.BufferedInputStream;
import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva10107 
{
     public static void main(String[] args)
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a;    
            a = scanner.nextInt();            
                list.add(a);
                System.out.println(a);
            a = scanner.nextInt();
            if(a>list.get(0))
                list.add(a);
            else
                list.add(0,a);
            System.out.println((list.get(0)+list.get(1))/2);
        while(scanner.hasNextInt())
        {
            a = scanner.nextInt();
            for(int i=0;i<list.size()-1;i++)
            {
                if(a>list.get(list.size()-1))
                {    
                    list.add(a);
                    break;
                }
                if(a<list.get(0))
                {
                    list.add(0,a);
                    break;
                }
                if(a==list.get(i))
                {
                    list.add(i,a);
                    break;
                }    
                if(a>list.get(i)&&a<list.get(i+1))
                {
                    list.add(i+1,a);
                    break;
                }    
            }
            int b = list.size()/2;
            if(list.size()%2==0)
                System.out.println((list.get(b)+list.get(b-1))/2);
            else
                System.out.println(list.get(b));           
        }
    }
}
