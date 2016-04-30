
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10003 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int capacity;
        while((capacity = scanner.nextInt())!=0)
        {
            int stop = scanner.nextInt();
            int p[] = new int[stop+2];
            p[0] = 0;
            p[stop+1] = capacity;
            for(int i=1;i<=stop;i++)
                p[i] = scanner.nextInt();
            
            data = new int[p.length][p.length];
            for(int i=0;i<stop+2;i++)
                for(int j=0;j<stop+2;j++)
                    data[i][j] = -1;
            
            System.out.printf("The minimum cutting is %d.%n" , dp(0 , stop+1 , p));
        }
    }
    static int data[][];
    
    public static int dp(int start , int end , int pos[])
    {
        if(data[start][end]!=-1)
            return data[start][end];
        if(start == end-1){
            data[start][end] = 0; 
            return 0;
        }
        
        int min = 1000000;
        
        for(int i=start+1;i<=end-1;i++)
        {
            min = Math.min(dp(start , i , pos) + dp(i , end , pos) + (pos[end] - pos[start]) , min);
        }
        data[start][end] = min;
        
        return min;
    }
}
