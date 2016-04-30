package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11332 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            while(a/10!=0)
            {
                int sum = 0;
                while(a/10!=0)
                {
                    sum = sum + a%10;
                    a = a/10;
                }
                a = a+sum;
            }
            System.out.println(a);
        }
    }   
}
