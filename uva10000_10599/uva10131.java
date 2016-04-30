

package uva10000_10599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10131 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        ArrayList<elephant> list = new ArrayList<elephant>();
        int pos = 1;
        while(scanner.hasNextInt())
        {
            int w = scanner.nextInt();
            int i = scanner.nextInt();
            list.add(new elephant(pos , w , i));
            pos++;
        }
        
        int length = list.size();
        Collections.sort(list);
        int lds[] = new int[length];
        int dp[] = new int[length];
        
        Arrays.fill(dp, 1);
        
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(list.get(i).smarter(list.get(j)))
                {
                    if(dp[i] + 1 > dp[j])
                    {
                        dp[j] = dp[i] + 1;
                        lds[j] = i;
                    }
                }
            }
        }
        
        int max = 0 
                , p = 0;
        sb = new StringBuilder("");
        for(int i=0;i<length;i++)
        {
            if(dp[i]>max)
            {
                max = dp[i];
                p = i;        
            }
        }
        sb.append(max+"\n");
        printids(list ,lds , p);
        
        System.out.print(sb);
    }
    static StringBuilder sb;
    public static void printids(ArrayList<elephant> list,int lds[] , int p)
    {
        if(lds[p]!=0) 
            printids(list , lds , lds[p]);
        sb.append(list.get(p).pos+ "\n");
    }
}
class elephant implements Comparable<elephant>
{
    int pos
        ,weight
         ,iq;
    public elephant(int a , int b, int c)
    {
        pos = a;
        weight = b;
        iq = c;
    }

    @Override
    public int compareTo(elephant t) {
        
        if(weight>t.weight)
            return 1;
        else if(t.weight>weight)
            return -1;
        else
            return 0;
    }
    public boolean smarter(elephant t)
    {
        if(iq>t.iq && weight < t.weight)
            return true;
        else
            return false;
    }
}
