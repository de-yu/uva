package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10041 
{
     public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int a = scanner.nextInt();
       for(int i=0;i<a;i++)
       {
           ArrayList<Integer> list = new ArrayList<Integer>();
           int b = scanner.nextInt();
           for(int j=0;j<b;j++)
               list.add(scanner.nextInt());
           Collections.sort(list);
           int median = (b%2==1?
                   list.get(b/2):
                   (list.get(b/2)+list.get(b/2-1))/2);
           int sum = 0;           
           for(int k:list)
               sum = sum + Math.abs(median-k);
           System.out.println(sum);
       }    
    }  
}
