package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva748 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextDouble())
       {
           double d = scanner.nextDouble();
           int d1 = (int)d;           
           BigDecimal bd = BigDecimal.valueOf(d);
           int a = scanner.nextInt();
           String str = bd.pow(a).toPlainString();
           if(d1==d)
               System.out.println(bd.pow(a).toBigInteger());           
           else if(d<1){
                    while(str.charAt(str.length()-1)=='0')
                        str = str.substring(0,str.length()-1);
                        System.out.println(str.substring(1, str.length()));
           }
           else
               System.out.println(str);
       }         
    }
}
