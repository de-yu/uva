
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11470 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = 1;
       while(scanner.hasNextInt())
       {
           int size = scanner.nextInt();
           if(size==0)
               break;
           int graph[][] = new int[size+2][size+2];
           
           for(int i=1;i<=size;i++)
               for(int j=1;j<=size;j++)
                   graph[i][j] = scanner.nextInt();
           
          StringBuilder sb = new StringBuilder("Case "+n+":"); 
          int a = 1 , b = 1;
          int status = 0;
          
          while(graph[a][b]!=0)
          {
              int sum = graph[a][b];
              graph[a][b] = 0;
              int c = a , d = b;
              while(status==0)
              {   
                  d++;
                  if(graph[c][d]==0)
                  {
                      status = 1;
                      d--;
                      break;
                  }
                  sum += graph[c][d];
                  graph[c][d] = 0;
              }
              while(status==1)
              {
                  c++;
                  if(graph[c][d]==0)
                  {
                      status = 2;
                      c--;
                      break;
                      
                  }
                  sum += graph[c][d];
                  graph[c][d] = 0;
              }
              while(status==2)
              {
                  d--;
                  if(graph[c][d]==0)
                  {
                      status = 3;
                      d++;
                      break;
                  }
                  sum += graph[c][d];
                  graph[c][d] = 0;
              }
              while(status==3)
              {
                  c--;
                  if(graph[c][d]==0)
                  {
                      c++;
                      break;
                  }
                  sum += graph[c][d];
                  graph[c][d] = 0;
              }
              a++;
              b++;
              status = 0;
              sb.append(" "+sum);
          }
          System.out.println(sb);
          n++;
       }
    }         
}
