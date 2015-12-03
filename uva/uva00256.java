package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00256 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int data[] = new int[10001];
        String space[] = {"","0","00","000","0000","00000","000000","0000000"};
        for(int i=0;i<10001;i++)
            data[i] = i*i;
        StringBuffer ans[] = new StringBuffer[5];
        for(int i=0;i<5;i++)
            ans[i] = new StringBuffer("");
       
        for(int i=0;i<10001;i++)
        {
            String str = Integer.toString(data[i]);
            
            for(int j=2;j<=8;j+=2)
            {
                if(str.length()>j)
                    continue;
                else
                {
                    str = space[j-str.length()] + str;
                    
                    int a = Integer.parseInt(str.substring(0, j/2));
                    int b = Integer.parseInt(str.substring(j/2,j));
                    if(a+b==i)
                    {
                        ans[j/2].append(str+"\n");
                    }
                }
            }
        }
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.print(ans[a/2]);
        }
    }
}
