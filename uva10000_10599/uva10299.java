/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10299 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        while(scanner.hasNextLong())
        {
            Long a = scanner.nextLong();
            Long b = scanner.nextLong();
            
            if(a==0)
            {
                System.out.println(0);
                continue;
            }
            
            b = (long)Math.pow(2, b);
            a--;
            Long data1[][] ={{1L,0L},{0L,1L}};
            Long data2[][] = {{1L,1L},{1L,0L}};
            while(a!=0)
            {
                if(a%2==1)
                   data1 = matrix(data1,data2,b);
                   data2 =  matrix(data2,data2,b);
                a=a/2;
            }
            System.out.println((data1[0][0]<0?b+data1[0][0]:data1[0][0]));
        }
    }
    public static Long[][] matrix(Long data1[][],Long data2[][],Long mod)
    {
        Long data[][] = new Long[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
            {
                int a = 0;
                for(int k=0;k<2;k++)
                {
                     a += data1[i][k]*data2[k][j];
                }
                data[i][j] = a%mod;
            }
        return data;
    }
}
