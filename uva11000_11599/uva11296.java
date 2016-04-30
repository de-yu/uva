package uva11000_11599;

import java.io.*;
import java.util.*;
public class uva11296 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       Long data[] = new Long[500001];
       data[1] = 3L;
       for(int i=2;i<500001;i++)
           data[i] = data[i-1] + i + 1;
       
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==1||a==0)
               System.out.println("1");
           else
               System.out.println(data[a/2]);
       }    
    }
}
