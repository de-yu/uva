/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10600_10999;

import uva600_1600.point;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10911 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            
            point p[] = new point[a*2];
            
            for(int i=0;i<a*2;i++)
            {
                String str = scanner.next();
                p[i] = new point(scanner.nextInt(),scanner.nextInt());              
            }
            pair pa = new pair();
            pa.backtracking(p,0 , a, 0,n,0);
            n++;
        }
    }
}
class point
{
    int x,y;
    
    public point(int a,int b)
    {
        x = a;
        y = b;
    }
}
class pair
{
	boolean use[] = new boolean[16];
	double min = 2147483647; 
	public void backtracking(point p[],int n,int a,double distance,int b,int c)
	{
		if(n==a*2)
		{
			min = Math.min(min,distance);
			return ;
		}
		if(distance>min)
                    return;
                int i = n;
                if(use[i])
                {
                    backtracking(p,n+1,a,distance,b,c);
                    return;
                }
                    for(int j=0;j<a*2;j++)
                    {
			if(!use[i]&&!use[j]&&i!=j)
			{
				use[j] = use[i] = true;
                                double d = Math.sqrt((p[i].x-p[j].x)*(p[i].x-p[j].x)+(p[i].y-p[j].y)*(p[i].y-p[j].y));
                                distance = distance + d;
                                backtracking(p,n+1,a,distance,b,c+2);
                                distance = distance - d;
				use[j] = use[i] = false;
			}
                    }		
                if(n==0)
                    System.out.printf("Case %d: %.2f%n",b,min);
	}
}
