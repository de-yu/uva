package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00489 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        int data[] = new int[26];
        for(int i=0;i<26;i++)
            data[i] = (int)Math.pow(2, i);
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==-1) break;
            String s1 = scanner.next();
            String s2 = scanner.next();
            int ss1 = 0;
            for(int i=0;i<s1.length();i++)
                ss1 = ss1 | data[(int)s1.charAt(i)-97];
            int yes[] = new int[26];
            int sum = 0;
            int lose = 0;
            for(int i=0;i<s2.length();i++)
            {
                int num = (int)s2.charAt(i)-97;
                if(yes[num]==0)
                {
                    if((data[num]&ss1)>0)
                        sum = sum|data[num];
                    else
                        lose++;
                    yes[num] = 1;
                }
                if((sum^ss1)==0)
                    break;
                if(lose==7)
                    break;
            }
            System.out.println("Round "+a);
            if(lose==7)
                System.out.println("You lose.");
            else
            {
                if((sum^ss1)==0)
                    System.out.println("You win.");
                else
                    System.out.println("You chickened out.");
            }
        }
    }
}

