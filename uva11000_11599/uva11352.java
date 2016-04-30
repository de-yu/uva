/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11000_11599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11352 
{ 
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        int a = scanner.nextInt();
        int x[] = {2,2,1,-1,-2,-2,-1,1};
        int y[] = {1,-1,-2,-2,-1,1,2,2};
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String data[][] = new String[b+4][c+4];
            int king_x = 0,king_y = 0,end_x = 0,end_y = 0;
            
            for(int j=0;j<b+4;j++)
                for(int k=0;k<c+4;k++)
                    data[j][k] = "*";
            for(int j=0;j<b;j++)
            {
                String str = scanner.next();
                for(int k=0;k<c;k++)
                {
                    data[j+2][k+2] = Character.toString(str.charAt(k));
                    if(str.charAt(k)=='A')
                    {
                        king_x = k+2;
                        king_y = j+2;
                    }
                    if(str.charAt(k)=='B')
                    {
                        end_x = k+2;
                        end_y = j+2;
                    }
                }
            }
            for(int j=2;j<b+2;j++)
            {
                for(int k=2;k<c+2;k++)
                {
                    if(data[j][k].equals("Z"))   
                        for(int l=0;l<8;l++)
                            if(data[j+y[l]][k+x[l]].equals("."))
                                data[j+y[l]][k+x[l]] = "*";       
                }
            } 
            process(data,b,c,king_x,king_y,end_x,end_y);
            
        }
    }
    public static void process(String data[][],int b,int c,int king_x,int king_y,int end_x,int end_y)
    {
        Queue<Integer> queue_x = new LinkedList<Integer>();
        Queue<Integer> queue_y = new LinkedList<Integer>();
        int num[][] = new int[b+4][c+4];
        int x[] = {1,1,1,0,-1,-1,-1,0};
        int y[] = {1,0,-1,-1,-1,0,1,1};
        queue_x.add(king_x);
        queue_y.add(king_y);
        
        while(queue_x.size()!=0)
        {
            int start_x = queue_x.poll();
            int start_y = queue_y.poll();
            for(int i=0;i<8;i++)
            {
                if((data[start_y+y[i]][start_x+x[i]].equals(".")||data[start_y+y[i]][start_x+x[i]].equals("B"))&&num[start_y+y[i]][start_x+x[i]]==0)
                {
                    num[start_y+y[i]][start_x+x[i]] = num[start_y][start_x] + 1;
                    queue_x.add(start_x+x[i]);
                    queue_y.add(start_y+y[i]);
                }
            }
        }
        if(num[end_y][end_x]==0)
            System.out.println("King Peter, you can't go now!");
        else
            System.out.println("Minimal possible length of a trip is " + num[end_y][end_x]);
    }
}
