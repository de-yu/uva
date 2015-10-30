
package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00106 
{
  public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuffer sb = new StringBuffer("");
       int nums[] = new int[1000001];
       ArrayList<triple> list = new ArrayList<triple>();
            for(int x=1;x<1000;x++)
            {
                for(int y=x+1;;y+=2)
                {
                    if(gcd(x,y)!=1)
                        continue;
                    int a = y*y-x*x;
                    int b = 2*x*y;
                    int c = y*y+x*x;
                    if(c>1000000)
                        break; 
                    nums[c]++;
                    list.add(new triple(a,b,c));
                }
            }
            for(int i=1;i<=1000000;i++)
                nums[i] = nums[i] + nums[i-1];
        while(scanner.hasNextInt())
        {
            int max = scanner.nextInt();
            int m = max;
            int data[] = new int[max+1];
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).z>max)
                    continue;
                else
                {
                    int x = list.get(i).x;
                    int y = list.get(i).y;
                    int z = list.get(i).z;
                    int j = 1;
                    while(j*z<=max)
                    {
                        if(data[x*j]==0)
                            m--;
                        if(data[y*j]==0)
                            m--;
                        if(data[z*j]==0)
                            m--;
                        data[x*j] = 1;
                        data[y*j] = 1;
                        data[z*j] = 1;
                        j++;
                    }
                }         
            }
            sb.append(nums[max]+" "+m+"\n");    
        }
        System.out.print(sb);
    }
    public static int gcd(int m, int n) { 
        if(n == 0) 
            return m; 
        else 
            return gcd(n, m % n); 
    } 
}
class triple
{
    int x;
    int y;
    int z;
    public triple(int a,int b,int c)
    {
        x = a;
        y = b; 
        z = c;
    }
}