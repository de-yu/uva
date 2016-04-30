
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10101 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNext())
        {
            String s = scanner.next();
            StringBuffer sb = new StringBuffer("");
            
            if(s.length()<=2)
            {
                System.out.printf("%5d.",n);
                System.out.println(s);
                n++;
                continue;
            }    
            if(s.length()>9)
            {
                sb.append(bangla(Integer.parseInt(s.substring(0,s.length()-9)),0));
                sb.append(bangla(Integer.parseInt(s.substring(s.length()-9,s.length()-2)),1));
            }
            else
                sb.append(bangla(Integer.parseInt(s.substring(0, s.length()-2)),0));
            int a =Integer.parseInt(s.substring(s.length()-2, s.length()));
            System.out.printf("%5d.",n);
            System.out.println(sb + "" + (a==0?"":a));
            n++;
        }
    }
    public static String bangla(int num,int choose)
    {
       int data[] = {100000,1000,10,1};
       String str[] = {" kuti "," lakh "," hajar "," shata "};
       String s = "";
       for(int i=0;i<4;i++)
       {
           if(num/data[i]!=0)
           {
               s = s + num/data[i]+str[i];
               num = num - num/data[i]*data[i];
           }
           else if(choose==1&&i==0)
           {
               s = s + "kuti ";
           }
       }
       return s;
    }
}
