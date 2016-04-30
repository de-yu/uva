
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10010 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        while(n-->0)
        {
            int h = scanner.nextInt()
                    ,w = scanner.nextInt();
            
            int word[][] = new int[h+2][w+2];
            
            for(int i=1;i<=h;i++)
            {
                String s = scanner.next();
                for(int j=1;j<=w;j++)
                {
                    int m = (int)s.charAt(j-1);
                    if(m<=90)
                        m += 32;
                    word[i][j] = m;
                }
            }
            
            int ques = scanner.nextInt();

            while(ques-->0)
            {
                String s = scanner.next();
                s = s.toLowerCase();
                
                int x[] = {1,1,1,0,-1,-1,-1,0};
                int y[] = {1,0,-1,-1,-1,0,1,1};
                int arr[] = word_arr(s);
                boolean answer = false;
                
              start:
              for(int i=1;i<=h;i++)
              {
                  for(int j=1;j<=w;j++)
                  {
                      if(arr[0]==word[i][j])
                      {
                          for(int k=0;k<8;k++)
                          {
                              answer = true;
                              for(int o=1;o<arr.length;o++)
                              {
                                  if(arr[o]!=word[i+o*y[k]][j+o*x[k]])
                                  {
                                      answer = false;
                                      break;
                                  }
                              }
                              if(answer)
                              {
                                  sb.append(i + " " +j +"\n");
                                  break start;
                              }
                          }
                      }
                  }
              }
            }
            if(n!=0)
            sb.append("\n");
        }System.out.print(sb);
    }
    public static int[] word_arr(String s)
    {
        int a[] = new int[s.length()];
        
        for(int i=0;i<s.length();i++)
            a[i] = (int)s.charAt(i);
        
        return a;
    }         
}
