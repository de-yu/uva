package uva2;

//第四項等於前三項合的費氏數列


import java.util.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;

public class uva00580 
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Long> list = new ArrayList<Long>();
        ArrayList<Long> out = new ArrayList<Long>();
        for(Long i=1L;i<4;i++)
                list.add(i);           
        for(int i=0;i<50;i++)
            list.add(list.get(i)+list.get(i+1)+list.get(i+2));
        
        out.add(1L);        
        for(int i=1;i<50;i++)
            out.add(out.get(i-1)*2+list.get(i-1));
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.println(out.get(a-3));
        }    
        
            
    }    
}
