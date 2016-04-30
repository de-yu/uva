

package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva825 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            Long data[][] = new Long[b+1][c+1];
            for(int j=0;j<=b;j++)
                for(int k=0;k<=c;k++)
                    data[j][k] = 0L;
            for(int j=0;j<=b;j++)
            {
                String str = scanner.nextLine();
                String s[] = str.split(" ");
                for(int k=1;k<s.length;k++)
                    data[Integer.parseInt(s[0])][Integer.parseInt(s[k])] = -1L;
            }
            data[1][1] = 1L;
            for(int j=1;j<=b;j++)
            {
                for(int k=1;k<=c;k++)
                {
                    if(data[j][k]<0||(j==1L&&k==1L))
                        continue;
                    data[j][k] = (data[j-1][k]<0?0:data[j-1][k]) + (data[j][k-1]<0?0:data[j][k-1]);      
                }
                
            }
            if(i!=0)
                System.out.println((data[b][c]<0?0:"\n"+data[b][c]));
            else
                System.out.println((data[b][c]<0?0:data[b][c]));
        }
    }
}
