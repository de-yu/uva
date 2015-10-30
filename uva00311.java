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
public class uva00311
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        
        while(scanner.hasNextInt())
        {
            int data[] = new int[6];
            int sum = 0;
            for(int i=0;i<6;i++)
                data[i] = scanner.nextInt();
            
            for(int i=5;i>=0;i--)
            {
                if(i==5)
                    sum += data[5];
                else if(i==4)
                {
                    sum += data[4];
                    data[0] = data[0]-data[4]*11;
                }
                else if(i==3)
                {
                    sum += data[3];
                    data[1] = data[1] - 5*data[3]; 
                    if(data[1]<0)
                    {
                        data[0] = data[0] + 4*data[1];
                        data[1] = 0;
                    }
                }
                else if(i==2)
                {
                     sum = sum + data[2]/4+(data[2]%4!=0?1:0);
                     int a = 36 - (data[2]%4)*9;
                     if(data[2]%4==1)
                     {   
                         data[0] -= (data[1]<5?7+(5-data[1])*4:7);
                         data[1] -= (data[1]<5?data[1]:5);                   
                     }
                     else if(data[2]%4==2)
                     {
                         data[0] -= (data[1]<3?6+(3-data[1])*4:6);
                         data[1] -= (data[1]<3?data[1]:3);
                     }
                     else  if(data[2]%4==3)
                     {
                        data[0] -= (data[1]<1?5+(1-data[1])*4:5);
                         data[1] -= (data[1]<1?data[1]:1);
                     }
                }
                else if(i==1)
                {
                    if(data[1]<=0)
                        continue;
                    else
                    {
                        sum  = sum + data[1]/9 + (data[1]%9!=0?1:0);
                        data[0] = data[0] - (36-(data[1]%9)*4);
                    }
                }
                else
                {
                     if(data[0]<=0)
                        continue;
                     else
                        sum  = sum + data[0]/36 + (data[0]%36!=0?1:0);
                }
            }
            if(sum==0)
                break;
            System.out.println(sum);
        }      
    }
    
}
