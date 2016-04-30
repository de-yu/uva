

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10474 
{
  public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int n = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==0)
                break;
            int data[] = new int[a];
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt();
            
            Arrays.sort(data);
            StringBuffer sb = new StringBuffer("CASE# "+n+":\n");
            for(int i=0;i<b;i++)
            {
                int c = scanner.nextInt();
                int d = Arrays.binarySearch(data,c);
                if(d<0)
                    sb.append(c+" not found");
                else
                {
                    d = check(data,d) + 1;
                    sb.append(c+" found at "+d);
                }
                sb.append("\n");
            }
            System.out.print(sb);
            n++;
        }
    }
    public static int check(int data[],int pos)
    {
        int a = data[pos];
        if(pos>=1)
        {
            while(data[pos-1]==a)
            {
                 pos--;
                 if(pos==0)
                     break;
            }
        }
        return pos;
    }
}