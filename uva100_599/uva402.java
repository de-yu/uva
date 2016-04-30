package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva402 
{
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        int s = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
           
            for(int i=1;i<=a;i++)
                list.add(i);
            for(int i=0;i<20;i++)
            {
                int n = scanner.nextInt();
                for(int j=n;j<=a;j+=n)
                {   
                    if(list.size()==b)
                        break;
                    if(j-j/n>=list.size())
                        break;
                    list.remove(j-j/n);
                }
            }
             StringBuilder sb = new StringBuilder("Selection #"+s+"\n");
            sb.append(list.get(0));
            for(int i=1;i<list.size();i++)
            {
                    sb.append(" "+list.get(i));
            }
            System.out.println(sb+"\n");
            s++;
        }    
    } 
}
