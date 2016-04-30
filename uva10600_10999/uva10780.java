
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva10780
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       ArrayList<Integer> data = new ArrayList<Integer>();
        int num[] = new int[10001];
        
        for(int i=2;i<10001;i++)
        {
            if(num[i]==0)
            {
                for(int j=i*i;j<10001;j+=i)
                    num[j] = 1;
            }
        }
        for(int i=2;i<10001;i++)
        {
           if(num[i]==0)
               data.add(i);
        } 
        
       int a = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder("");
       for(int i=1;i<=a;i++)
       {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int b = Integer.parseInt(st.nextToken());
           int c = Integer.parseInt(st.nextToken());
           ArrayList<num> list = new ArrayList<num>();
           
           for(int j:data)
           {
               if(j>b)
                   break;
               int s = 0;
               if(b%j==0)
               {
                    while(b%j==0)
                    {
                        b = b/j;
                        s++;
                    }
                    list.add(new num(j,s));
               }
           }
           int min = 100000;
           
           for(num n:list)
           {
               int d = n.factor;
               int sum = 0;
               while(d<=c)
               {
                   sum = sum + c/d;
                   d = d*n.factor;
               }
               sum = sum/n.sum;
               if(min>sum)
                   min = sum;
           }
           sb.append("Case "+i+":\n");
           if(min == 0)
               sb.append("Impossible to divide\n");
           else
            sb.append(min+"\n");
       }
       System.out.print(sb);
    } 
}
class num
{
    int factor;
    int sum;
    public num(int f,int s)
    {
        factor = f;
        sum = s;
    }
}
