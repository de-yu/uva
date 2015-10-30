
package uva4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00993 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
             
        int a = scanner.nextInt();   
        for(int i=0;i<a;i++)
        {
            int s = scanner.nextInt();
            int data[] = new int[10];
            if(s==1)
                System.out.println(1);
            else
            {
                BigInteger bi = BigInteger.valueOf(s);
                if(bi.isProbablePrime(2))
                {
                    System.out.println(-1);
                    continue;
                }
                else
                {
                    for(int j=9;j>=2;j--)
                    {
                        while(s%j==0)
                        {
                            data[j]++;
                            s = s/j;
                        }
                    }
                    if(s!=1)
                    {
                         System.out.println(-1);
                        continue;
                    }
                    while(data[2]>=1&&data[3]>=1)
                    {
                        int b = (data[2]>=data[3]?data[3]:data[2]);
                        data[6] = b;
                        data[2] = data[2]-b;
                        data[3] = data[3]-b;
                    }
                    StringBuffer sb = new StringBuffer("");
                    for(int j=2;j<10;j++)
                    {
                        for(int k=0;k<data[j];k++)
                        {
                            sb.append(j);
                        }
                    }
                    System.out.println(sb);
                    
                }
            }
        }
    }
}
