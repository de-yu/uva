
package uva;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00406 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
         ArrayList<Integer> data = new ArrayList<Integer>();
        int num[] = new int[1000];
        data.add(1);
        for(int i=2;i<1000;i++)
        {
            if(num[i]==0)
            {
                for(int j=i*i;j<1000;j+=i)
                    num[j] = 1;
            }
        }
        for(int i=2;i<1000;i++)
        {
           if(num[i]==0)
               data.add(i);
        }
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();            
            ArrayList<Integer> list = new ArrayList<Integer>();
            StringBuffer sb = new StringBuffer(a+" "+b+":");
            for(int i:data)
            {
                if(a<i)
                    break;
                else
                    list.add(i);
            }
            if(list.size()%2==1)
            {
                int mid = list.size()/2;
                int sum = (b*2-2)/2;
                if(mid+sum>=list.size())
                    out(list,sb,0,list.size()-1);
                else
                    out(list,sb,mid-sum,mid+sum);
            }
            else
            {
                int mid = (list.size()-1)/2;
                if(mid+b>=list.size())
                    out(list,sb,0,list.size()-1);
                else
                    out(list,sb,mid+1-b,mid+b);
            }
                    
            
        }
        
    }        
    public static void out(ArrayList<Integer> list,StringBuffer sb,int s,int e)
    {
        for(int i=s;i<=e;i++)
            sb.append(" "+list.get(i));
        System.out.println(sb+"\n");
    }
}