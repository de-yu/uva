/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00514 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
     while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;

            start:
            while(scanner.hasNextInt())
            {
                int s[] = new int[a];
                int q[] = new int[a];
                int b = 0,c = 0;
                for(int i=0;i<a;i++)
                {
                    q[i] = scanner.nextInt();
                    if(q[i]==0)
                        break start;
                }
                for(int i=1;i<=a;i++)
                {
                    s[b++] = i;
                    while(s[b-1]==q[c])
                    {
                        b--;
                        c++;
                        if(b==0)
                            break;
                    }
                }
                if(b>0)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
            System.out.println();
        }
    }
}
