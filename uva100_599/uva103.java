
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva103 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt()
                    ,b = scanner.nextInt();
            
            Box box[] = new Box[a];
            int lis[] = new int[a];
            int printlis[] = new int[a];
            for(int i=0;i<a;i++)
            {
                box[i] = new Box(b , i);
                for(int j=0;j<b;j++)
                    box[i].add(scanner.nextInt());
                box[i].sort();
            }
            Arrays.sort(box);
            Arrays.fill(lis, 1);
            Arrays.fill(printlis, -1);
            
            for(int i=0;i<a;i++)
            {
                for(int j=i+1;j<a;j++)
                {
                    if(box[j].bigger(box[i])==1){
                        if(lis[i]+1>lis[j]){
                            lis[j] = lis[i]+1;
                            printlis[j] = i;
                        }
                    }
                }    
            }
            int max = 0, p = 0;
            
            for(int i=0;i<a;i++)
            {
              if(lis[i]>max){
                  max = lis[i];
                  p = i;
              }
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(max + "\n");
            ans = "";
            trace(p , box , printlis);
            sb.append(ans.substring(0, ans.length()-1)+"\n");
            System.out.print(sb);
            
        }
    }
    static String ans;
    public static void trace(int p , Box box[] , int printlis[])            
    {
        if(printlis[p] != -1)
            trace(printlis[p] , box , printlis);
        ans = ans + (box[p].pos+1) + " ";
    }
}
class Box implements Comparable<Box>
{
    int edge[];
    int index = 0;
    int pos = 0;
    public Box(int size,int pos)
    {
        edge = new int[size];
        this.pos = pos;
    }
    public void add(int val)
    {
        edge[index] = val;
        index++;
    }
    public void sort()
    {
        Arrays.sort(edge);
    }

    public int compareTo(Box t) 
    {
        int length = edge.length;       
        for(int i=0;i<length;i++)
        {
            if(edge[i]>t.edge[i])
                return 1;
            else if(edge[i]<t.edge[i])
                return -1;
            else
                return 0;
        }
        return 0;
    }
    public int bigger(Box t)
    {
        int ans = 1;
        int length = edge.length;       
        for(int i=0;i<length;i++)
        {
            if(edge[i]<=t.edge[i])
            {
                ans = 0;
                break;
            }
        }
        return ans;

    }
}
