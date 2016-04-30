
package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva884 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        ArrayList<Integer> data = new ArrayList<Integer>();
        int num[] = new int[1001];
        for(int i=2;i<1001;i++)
        {
            if(num[i]==0)
                for(int j=i*i;j<1001;j+=i)
                    num[j] = 1;
        }
        for(int i=2;i<1001;i++)
        {
           if(num[i]==0)
               data.add(i);
        }
        
        amount[2] = 1;
        for(int i=3;i<1000001;i++)
        {
            s = 0;
            amount[i] = amount[i-1] + sum(data,i);
        }
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            sb.append(amount[a]+"\n");
        }
        System.out.print(sb);
    }
    static int amount[] = new int[1000001];
    static int s = 0;
    public static int sum(ArrayList<Integer> data,int n)
    {
        if(prime(data,n))
        {
            return 1;
        }
        if(amount[n]!=0)
        {
            return amount[n]-amount[n-1];
        }
        for(int i:data)
        {
            if(n%i==0)
            {
                n = n/i;
                s++;
                s = s + sum(data,n);
                break;
            }
        }   
        return s;
    }
    public static boolean prime(ArrayList<Integer> data,int n)
    {
        boolean boo = true;
        for(int i:data)
        {
            if(i*i>n)
                break;
            if(n%i==0)
            {
                boo = false;
                break;
            }
        }
        return boo;
    }
}
