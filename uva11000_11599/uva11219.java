
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11219 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int a = scanner.nextInt();
       for(int i=1;i<=a;i++)
       {
           String b = scanner.next();
           String c = scanner.next();
           String bb[] = b.split("/");
           String cc[] = c.split("/");
           int bbb[] = new int[3];
           int ccc[] = new int[3];
           for(int j=0;j<3;j++)
           {
               bbb[j] = Integer.parseInt(bb[j]);
               ccc[j] = Integer.parseInt(cc[j]);
           }
           int age = 0;
           if(bbb[1]==ccc[1]){
               if(bbb[0]>ccc[0])
                   age = 0;
               else if(bbb[0]==ccc[0])
                   age = 0;
               else
                   age = -1;
           }
           else
           {
               if(bbb[1]>ccc[1])
                   age = 0;
               else
                   age = -1;
           }
           age = age + bbb[2]-ccc[2];
           if(age<0)
               System.out.println("Case #"+i+": Invalid birth date");
           else if(age>130)
                System.out.println("Case #"+i+": Check birth date");
           else
           System.out.println("Case #"+i+": "+age);               
       }    
    }
}
