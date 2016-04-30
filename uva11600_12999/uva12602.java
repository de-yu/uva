package uva11600_12999;

import java.util.*;
import java.lang.*;
public class uva12602 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        while(a-->0)
        {
            String str = scanner.next();
            String s = str.substring(4, 8);
            int b = Integer.parseInt(s);
            int sum =0;
            for(int j=0;j<=2;j++)
            {   
                int d = str.charAt(j)-65;
                sum += d * Math.pow(26, 2-j);
            }
            if(Math.abs(sum-b)<=100)
            System.out.println("nice");
            else
            System.out.println("not nice");    
        }    
    }        
}
