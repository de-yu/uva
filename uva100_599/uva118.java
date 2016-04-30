//將題目要求的x y軸和矩陣搞反不過還是對了
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva118 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int data[][] = new int[b+1][a+1];
        String dir[] = {"N","E","S","W"};
        while(scanner.hasNextInt())
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            String s = scanner.next();
            int direction = 0;
            for(int i=0;i<4;i++)
                if(s.equals(dir[i]))
                   direction = i; 
            String run = scanner.next();
            boolean yes = false;
            for(int i=0;i<run.length();i++)
            {
                if(run.charAt(i)=='R')
                    direction = (direction+1)%4;
                if(run.charAt(i)=='L')
                {
                    direction = (direction-1)%4;
                    direction = (direction<0?3:direction);
                }
                if(run.charAt(i)=='F')                    
                {
                    if(direction==0)
                    {
                        if(y+1>b&&data[y][x]==0)
                        {
                            System.out.println(x+" "+y+" "+dir[0]+" LOST");
                            data[y][x] = 1;
                            yes = true;
                            break;
                        }
                        else if(y+1>b&&data[y][x]==1)
                            continue;
                        else
                            y = y + 1;
                    }
                    if(direction==1)
                    {
                        if(x+1>a&&data[y][x]==0)
                        {
                            System.out.println(x+" "+y+" "+dir[1]+" LOST");
                            data[y][x] = 1;
                            yes = true;
                            break;
                        }
                         else if(x+1>a&&data[y][x]==1)
                            continue;
                        else
                            x = x + 1;
                    }
                    if(direction==2)
                    {
                        if(y-1<0&&data[y][x]==0)
                        {
                            System.out.println(x+" "+y+" "+dir[2]+" LOST");
                            data[y][x] = 1;
                            yes = true;
                            break;
                        }
                         else if(y-1<0&&data[y][x]==1)
                            continue;
                        else
                            y = y - 1;
                    }
                    if(direction==3)   
                    {
                        if(x-1<0&&data[y][x]==0)
                        {
                            System.out.println(x+" "+y+" "+dir[3]+" LOST");
                            data[y][x] = 1;
                            yes = true;
                            break;
                        }
                         else if(x-1<0&&data[y][x]==1)
                            continue;
                        else
                            x = x - 1;
                    }    
                }
            }
            if(!yes)
                System.out.println(x+" "+y+" "+dir[direction]);
        }
    }
}
