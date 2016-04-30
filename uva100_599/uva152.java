/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva152
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
       int distance[] = new int[10];
       ArrayList<three_dem> list = new ArrayList<three_dem>(); 
       while(true)
       {
          StringTokenizer st = new StringTokenizer(br.readLine());
          
          three_dem td = new three_dem(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
          if(td.zero())
              break;
          list.add(td);
       }
       int size = list.size();
       
       for(int i=0;i<size;i++)
       {
           int min = Integer.MAX_VALUE;
           for(int j=0;j<size;j++)
           {
               if(i==j)  continue;
               min = Math.min(list.get(i).distance(list.get(j)), min);
           }
           if(min<10)
               distance[min]++;
       }
      
       for(int i=0;i<10;i++)
           System.out.printf("%4d",distance[i]);
       System.out.println();
    }
}
class three_dem
{
    int a,b,c;
    public three_dem(int d,int e,int f)
    {
        a = d;
        b = e;
        c = f;
    }
    public boolean zero()
    {
        if(a==0&&b==0&&c==0)
            return true;
        return false;
    }
    public int distance(three_dem td)
    {
        int d = Math.abs(td.a-a);
        int e = Math.abs(td.b-b);
        int f = Math.abs(td.c-c);
        return (int)Math.sqrt(d*d+e*e+f*f);
    }
}
