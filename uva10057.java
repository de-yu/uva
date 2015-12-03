
package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10057 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNextInt())
        {
        	int a = scanner.nextInt();      	
        	ArrayList<Integer> list = new ArrayList<Integer>();
                
                for(int i=0;i<a;i++)
                    list.add(scanner.nextInt());                
                Collections.sort(list);
                
                int b = list.get(a/2-1);
                int c = list.get(a/2);
                int bsum = 0;
                int csum = 0;
                int d = 0,e = 0;
                for(int h:list)
                {
                       bsum = bsum + Math.abs(h-b);
                       csum = csum + Math.abs(h-c);
                       if(h==b)
                           d++;
                       if(h==c)
                           e++;            
                }
                if(bsum==csum)
                {     if(b==c)
                    System.out.println(b+" "+e+" "+(Math.abs(b-c)+1));
                    else
                    System.out.println(b+" "+(e+d)+" "+(Math.abs(b-c)+1));
                }
                else if(bsum>csum)
                    System.out.println(c+" "+e+" "+1);
                else
                    System.out.println(b+" "+d+" "+1);
          }        
    }
}
