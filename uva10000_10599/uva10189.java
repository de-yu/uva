
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10189 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        int n = 1;
        while(scanner.hasNextInt())
        {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            if(height==0)
                break;
            int data[][] = new int[height+2][width+2];
            
            for(int i=0;i<height+2;i++)
            {
                data[i][0] = 9;
                data[i][width+1] = 9;
            }
            for(int i=0;i<width+2;i++)
            {
                data[0][i] = 9;
                data[height+1][i] = 9;
            }
            
            for(int i=0;i<height;i++)
            {
                String str = scanner.next();
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(j)=='*')
                        addone(i+1,j+1,data);
                }
            }
           if(n>0)
            System.out.println();
            System.out.printf("Field #%d:%n",++n);
            for(int i=1;i<height+1;i++)
            {
                StringBuffer sb = new StringBuffer("");
                for(int j=1;j<width+1;j++)
                {                   
                   if(data[i][j]<0)
                       sb.append('*');
                   else
                       sb.append(data[i][j]);
                }
                System.out.println(sb);
            }
        }
    }
    public static void addone(int h,int w,int data[][])
    {
        int num_h[] = {-1,-1,-1,0,1,1,1,0};
        int num_w[] = {-1,0,1,1,1,0,-1,-1};
        
        for(int i=0;i<8;i++)
        {
            data[h+num_h[i]][w+num_w[i]]++;
        }
        data[h][w] = -10;
    }
}
