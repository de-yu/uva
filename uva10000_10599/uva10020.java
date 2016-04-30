
package uva10000_10599;


import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10020 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int endX = scanner.nextInt();
            ArrayList<Segament> segamentList = new ArrayList<Segament>();
            
            while(true)
            {
                int start = scanner.nextInt()
                        ,end = scanner.nextInt();
                if(start==0&&end==0)
                    break;
                segamentList.add(new Segament(start , end));
            }
            
            Collections.sort(segamentList);
            
            int end = 0;
            ArrayList<Segament> ansList = new ArrayList<Segament>();
            StringBuilder sb = new StringBuilder("");
            boolean ans_exist = false;
            while(end < endX)
            {
               Segament max = new Segament(0,0);
               int maxRange = 0;
               for(Segament segament:segamentList)
               {
                    if(segament.start <= end && segament.end > end && segament.range(end)> maxRange)
                    {
                        max.set(segament);
                        maxRange = segament.range(end);
                    }
               }
               ansList.add(max);
               end = max.end;
               
               if(end >=endX)
               {
                   sb.append(ansList.size()+"\n");
                   for(Segament segament:ansList)
                   {
                       sb.append(segament.start+" "+segament.end+"\n");
                   }
                   ans_exist = true;
               }
               if(maxRange==0)
                   break;
            }
            if(ans_exist)
                System.out.print(sb);
            else
                System.out.println("0");
            if(n!=0)
                System.out.println();
        }
    }
 
}

class Segament implements Comparable<Segament>
{
    int start , end;
    public Segament(int start , int end)
    {
        this.start = start;
        this.end = end;
    }
    public void set(Segament t)
    {
        start = t.start;
        end = t.end;
    }
    public int range(int i)
    {
        return end-i;
    }
    @Override
    public int compareTo(Segament t) {
        if(start > t.start)
            return 1;
        else if(start < t.start)
            return -1;
        else 
            return 0;
                
    }
    
}
