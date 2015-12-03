

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00967 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int data[] = new int[1000001];
       
       for(int i=100;i<1000001;i++)
       {
           boolean boo = true;
           if(!two(i))
           {
               String s = Integer.toString(i);
               int length = s.length();
               s = s + s;
               BigInteger bi;
               for(int j=0;j<length;j++)
               {
                    bi = new BigInteger(s.substring(j, j+length));
                    if(!bi.isProbablePrime(3))
                        boo = false;

               }
           }
           else
               boo = false;
           
           if(boo)
               data[i] = data[i-1] + 1;
           else
               data[i] = data[i-1];
       }
       
       StringBuilder sb = new StringBuilder("");
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==-1)
               break;
           int b = scanner.nextInt();
           int sum = data[b] - data[a-1];
           
           if(sum==0)
               sb.append("No Circular Primes.\n");
           else if(sum==1)
               sb.append("1 Circular Prime.\n");
           else
               sb.append(sum + " Circular Primes.\n");
       }
       System.out.print(sb);
    }
    
    public static boolean two(int a)
    {
        boolean boo = false;
        
        while(a!=0)
        {
            if((a&1)==0)
            {
                boo = true;
                break;
            }
            a = a/10; 
        }
        
        return boo;
    }
}
