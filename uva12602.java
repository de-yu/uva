package uva;

import java.util.*;
import java.lang.*;
public class uva12602 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i=0;i<=a-1;i++)
        {
            String str = scanner.next();
            String s = str.substring(4, 8);
            int b = Integer.parseInt(s);
            int c = 0;
            int sum =0;
            for(int j=0;j<=2;j++)
            {   
                c = 0;
                for(char k='A';k<='Z';k++)
                {
                    if(str.charAt(2-j)==k)
                    {
                        sum = sum + c*(int)Math.pow(26, j);
                        System.out.println(sum);
                    }
                    else
                    c++;
                }    
            }
            System.out.println(sum);
            if(Math.abs(sum-b)<=100)
            System.out.println("nice");
            else
            System.out.println("not nice");    
        }    
    }        
}
