

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00608 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int data[][][] = new int[2][12][12];
        for(int j=0;j<2;j++)
            for(int i=0;i<12;i++)
                data[j][i][i] = (j==0?1:-1);
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            String str[][] = new String[3][3];
            for(int j=0;j<3;j++)
                for(int k=0;k<3;k++)
                    str[j][k] = scanner.next();
            
            start:
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<12;k++)
                {
                   boolean answer = true;
                   for(int m=0;m<3;m++)
                   {
                        int one = sum(data,str[m][0],j,k);
                        int two = sum(data,str[m][1],j,k);
                        String s = "";
                        if(one>two)
                            s = "up";
                        else if(two>one)
                            s = "down";
                        else
                            s = "even";
                        if(!(s.equals(str[m][2])))
                            answer = false;
                   }
                   if(answer)
                   {
                       System.out.printf("%s is the counterfeit coin and it is %s.%n",(char)(k+65),(j==0?"heavy":"light"));
                       break start;
                   }
                }
            }
        }
    }
    public static int sum(int data[][][],String str,int n,int k)
    {
        int s = 0;
        for(int i=0;i<str.length();i++)
        {
            s = s + data[n][k][(int)str.charAt(i)-65];
        }       
        return s;
    }
}
