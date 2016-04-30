package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva574 
{ 
    public static void main(String[] args)throws IOException
    {
         Scanner scanner = new Scanner(new BufferedInputStream(System.in));
         while(scanner.hasNextInt())
         {
             int a = scanner.nextInt();
             int b = scanner.nextInt();
             if(a==0&&b==0)
                 break;
             int c[] = new int[b];
             for(int i=0;i<b;i++)
                 c[i] = scanner.nextInt();
             System.out.println("Sums of "+a+":");
             Backtracking back = new Backtracking();
             back.nonMultiplePermutations(c, a, 0,"",0);
         }    
                 
    }        
}
class Backtracking
{
    boolean use[] = new boolean[1000];
    boolean b = true;
    public void nonMultiplePermutations(int data[],int answer,int sum,String s,int n)//data need (Arranged according to size) answer = ""
    {
        if(sum==answer)
        {
            System.out.println(s.substring(1,s.length()));
            b = false;
            return;
        }
        int last_str = 0;
        for(int i=n;i<data.length;i++)
        {
            if(!use[i])
            {
                if(data[i]!=last_str)
                {
                    last_str = data[i];
                    use[i] = true;
                    nonMultiplePermutations(data,answer,sum+data[i], s + "+" + Integer.toString(data[i]),i+1);
                    use[i] = false;
                }
            }    
        }
        if(b==true&&n==0)
            System.out.println("NONE");
    } 
}
