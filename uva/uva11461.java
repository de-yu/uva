package uva;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11461 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
        
        int data[] = new int[100001];
        for(int i=1;i<100001;i++)
        {
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i)
                data[i] = data[i-1] + 1;
            else 
                data[i] = data[i-1];
        }
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(b==0)
               break;
            System.out.println(data[b]-data[a]+((int)Math.sqrt(a)*(int)Math.sqrt(a)==a?1:0));
        }
    }
}
