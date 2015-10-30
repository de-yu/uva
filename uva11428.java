

package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11428 
{
   public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        number data[] = new number[10001];
        for(int i=0;i<10001;i++)
            data[i] = new number(10000,10000);
        
        for(int y=1;;y++)
        {
            for(int x=y+1;;x++)
            {
                if(cube(x)-cube(y)>10000)
                    break;
                int z = cube(x)-cube(y);
                if(data[z].y>y)
                {
                    data[z].x = x;
                    data[z].y = y;
                }
            }
            if(cube(y+1)-cube(y)>10000)
                break; 
        }     
        while(scanner.hasNextInt())
        {
            int b = scanner.nextInt();
            if(b==0)
                break;
            if(data[b].x==10000)
                System.out.println("No solution");
            else
                System.out.println(data[b].x+" "+data[b].y);
        }
    }
    public static int cube(int a)
    {
        return a*a*a;
    }
}
class number
{
    int x;
    int y;
    public number(int a,int b)
    {
        x = a;
        y = b;
    }
}