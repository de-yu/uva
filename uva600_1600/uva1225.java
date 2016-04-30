
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva1225 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        number_team data[] = new number_team[10001];
        for(int i=0;i<10001;i++)
            data[i] = new number_team();
        
        for(int i=1;i<10001;i++)
        {
            int num[] = new int[10];
            String s = Integer.toString(i);
            for(int j=0;j<s.length();j++)
                num[s.charAt(j)-48]++;
            
            data[i].set(num);
            data[i].add(data[i-1]);
        }
        
        int n = scanner.nextInt();
        while(n-->0)
        {
            int a = scanner.nextInt();
            int num[] = data[a].get();
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0;i<10;i++)
                sb.append(" "+num[i]);
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
class number_team
{
    int data[];
    public number_team()
    {
        data = new int[10];
    }
    public void set(int num[])
    {
        for(int i=0;i<10;i++)
            data[i] = num[i];
    }
    public void add(number_team nt)
    {
        for(int i=0;i<10;i++)
            data[i] = data[i] + nt.data[i];
    }
    public int[] get()
    {
         return data;
    }
}
