
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11790 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        for(int m=1;m<=n;m++)
        {
            int posSum = scanner.nextInt();
            int height[] = new int[posSum];
            int width[] = new int[posSum];
            
            int increase = 0,decrease = 0; 
            int lis[] = new int[posSum];
            int lds[] = new int[posSum];
            for(int i=0;i<posSum;i++)
                height[i] = scanner.nextInt();
            for(int i=0;i<posSum;i++)
            {
                width[i] = scanner.nextInt();
                increase = decrease = Math.max(increase ,width[i]);
            }
            lis = width.clone();
            lds = width.clone();
            for(int i=0;i<posSum;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(height[i] > height[j])
                        lis[i] = Math.max(lis[i], lis[j] + width[i]);      
                }
                increase = Math.max(increase , lis[i]);
            }
            for(int i=0;i<posSum;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(height[i] < height[j])
                        lds[i] = Math.max(lds[i], lds[j] + width[i]); 
                }
                decrease = Math.max(decrease , lds[i]);
            }
            if(increase >= decrease)
                sb.append("Case "+m+". Increasing ("+increase+"). Decreasing ("+decrease+").\n");
            else
                sb.append("Case "+m+". Decreasing ("+decrease+"). Increasing ("+increase+").\n");
            
        }
        System.out.print(sb);
    }
}
