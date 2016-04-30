

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10034 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       int n = scanner.nextInt();
       
       for(int m=0;m<n;m++)
       {
           int a = scanner.nextInt();
           double point[][] = new double[a][2];
           double graph[][] = new double[a][a];
           for(int i=0;i<a;i++)
           {
               point[i][0] = scanner.nextDouble();
               point[i][1] = scanner.nextDouble();
           }
           for(int i=0;i<a;i++)
           {
               for(int j=0;j<a;j++)
               {
                   if(i!=j)
                       graph[i][j] = Math.sqrt(distance(point[i][0],point[j][0])+distance(point[i][1],point[j][1]));
               }    
           }     
           
           boolean p[] = new boolean[a];
           double dis[] = new double[a];
           Arrays.fill(dis, 1000000);
           
           double sum = 0;
           int prev = 0;

           for(int i=0;i<a-1;i++)
           {
               p[prev] = true;
               
               for(int j=0;j<a;j++)
                   dis[j] = Math.min(dis[j] , graph[prev][j]);
               
               double mind = 1000000;
               int minp = 1000000;
               for(int j=0;j<a;j++)
               {
                   if(dis[j]<mind&&!p[j])
                   {
                       mind = dis[j];
                       minp = j;
                   }
               }    
               
               sum += mind;
               prev = minp;
           }
           if(m!=0)
               System.out.println();
           System.out.printf("%.2f%n",sum);
       }
    }
    public static double distance(double a,double b)
    {
        return (a-b)*(a-b);
    }
}
