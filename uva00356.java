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
public class uva00356 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        int data[] = new int[151];
        int diff[] = new int[151];
        for(int i=1;i<151;i++)
            diff[i] = (i*2-1)*4;
        
        for(double i=0;i<151;i++)
        {
            for(double j=1;j<=(i*2-1)/2;j++)
            {
                for(double k=1;k<=(i*2-1)/2;k++)
                {
                    if(Math.sqrt(k*k+j*j)<(i*2-1)/2)
                        data[(int)i]++;
                }
            }
            data[(int)i] = data[(int)i]*4;
        }
        int n =0;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(n>0)
                System.out.println();
            System.out.printf("In the case n = %d, %d cells contain segments of the circle.%nThere are %d cells completely contained in the circle.%n",a,diff[a],data[a]);
            n++;
        }
        
    }
}
