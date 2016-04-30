package uva11000_11599;

import java.io.*;
import java.util.*;
public class uva11069 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
       int data[] = new int[77];
       data[1] = 1;
       data[2] = 2;
       data[3] = 2;
       for(int i=4;i<77;i++)
       data[i] = data[i-2] + data[i-3];
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           System.out.println(data[a]);
       }    
    }   
}
