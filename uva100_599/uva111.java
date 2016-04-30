
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva111 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
            int a = scanner.nextInt(); 
            int fir[] = new int[a];
            int sec[] = new int[a];
            
            for(int i=0;i<a;i++)
                fir[i] = scanner.nextInt();
            change(fir,a);
            while(scanner.hasNext())
            {
                for(int i=0;i<a;i++)
                    sec[i] = scanner.nextInt();
                int data[][] = new int[a+1][a+1];
                change(sec,a);
                for(int i=0;i<a;i++)
                {
                    for(int j=0;j<a;j++)
                    {
                        if(fir[i]==sec[j])
                        {
                            data[i+1][j+1] = data[i][j] + 1;
                        }
                        else
                        {
                            data[i+1][j+1] = Math.max(data[i][j+1],data[i+1][j]);
                        }
                    }
                }
                System.out.println(data[a][a]);
            }
    }
    public static void change(int data[],int a)
    {
        int n[] = new int[a];
        
        for(int i=0;i<a;i++)
        {
            n[data[i]-1] = i+1;
        }
        for(int i=0;i<a;i++)
            data[i] = n[i];
    }
}
