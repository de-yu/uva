/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10004 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0) break;
            int b = scanner.nextInt();
            int map[][] = new int[a][a];
            boolean here[] = new boolean[a];
            int color[] = new int[a];
            
            while(b-->0)
            {
                int c = scanner.nextInt();
                int d = scanner.nextInt();   
                map[c][d] = 1;
                map[d][c] = 1;
            }
            
            boolean boo = false;
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(0);
            color[0] = 1;
            start:
            while(queue.size()!=0)
            {
                int point = queue.poll();
                here[point] = true;
                for(int i=0;i<a;i++)
                {
                    if(map[point][i]==1&&!here[i])
                    {
                        queue.add(i);
                        if(color[point]==1)
                        {
                            if(color[i]==0||color[i]==2)
                                color[i] = 2;
                            else
                            {
                                boo = true;
                                break start;
                            }
                        }
                         if(color[point]==2)
                        {
                            if(color[i]==0||color[i]==1)
                                color[i] = 1;
                            else
                            {
                                boo = true;
                                break start;
                            }
                        }
                        
                    }
                }
            } if(boo)
                    System.out.println("NOT BICOLORABLE.");
                else
                    System.out.println("BICOLORABLE.");
        }
    } 
}
