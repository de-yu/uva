/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00668 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = 0;
            for(int j=3,k=2;j<=50;j++,k++)
            {
                if((j+2)*k/2>b)
                {
                    c = k-1;
                    b = b-((j-1)+2)*(k-1)/2;
                    break;
                }
                else if((j+2)*k/2==b)
                {
                    c = k;
                    b = b-(j+2)*k/2;
                    break;
                }
            }
            
            int data[] = new int[c];
            
            for(int j=0;j<c;j++)
                data[j] = j+2;
            int n = c-1;
            while(b!=0)
            {
                data[n]++;
                b--;
                n--;
                if(n==-1)
                    n = c-1;
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<c;j++)
            {
                if(j>0)
                    sb.append(" ");
                sb.append(data[j]);
                
            }
            if(i!=0)
                System.out.println();
            System.out.println(sb);
        }
    }
}
