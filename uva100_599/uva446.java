package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva446 
{ 
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int data[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
       int a = scanner.nextInt();
       for(int i=0;i<a;i++)
       {
           String s[] = new String[3];
           s[0] = scanner.next();
           s[2] = scanner.next();
           s[1] = scanner.next();
           int c[] = new int[2];
           for(int k=0;k<2;k++)
           {    
                for(int j=0;j<s[k].length();j++)
                {
                    if((int)s[k].charAt(j)<58)
                        c[k] = c[k] + data[(int)s[k].charAt(j)-48]*(int)Math.pow(16,s[k].length()-1-j);
                    else
                        c[k] = c[k] + data[(int)s[k].charAt(j)-55]*(int)Math.pow(16,s[k].length()-1-j);
                }
           }
           int sum = (s[2].equals("+")?c[0]+c[1]:c[0]-c[1]);
           s[0] = Integer.toString(c[0],2);
           s[1] = Integer.toString(c[1],2);
           for(int j=0;j<2;j++)
           {
               while(s[j].length()!=13)
                   s[j] = "0" + s[j];
           }
           char str = '=';
           System.out.println(s[0]+" "+s[2]+" "+s[1]+" "+str+" "+sum);
       }    
    }         
}
