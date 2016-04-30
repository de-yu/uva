package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10336 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int a = scanner.nextInt();
        int n = 1;
        for(int i=0;i<a;i++)
        {
            Hashtable<String,Integer> table = new Hashtable<String,Integer>();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String data[][] = new String[b+2][c+2];
            for(int j=0;j<=b+1;j++)
                for(int l=0;l<=c+1;l++)
                    data[j][l] = "0";
            for(int j=1;j<=b;j++)
            {
                String str = scanner.next();
                for(int l=1;l<=c;l++)
                    data[j][l] = Character.toString(str.charAt(l-1));       
            }
            graph2 g = new graph2();
            System.out.println("World #"+n);
            g.bfs(data, table, b, c);
            n++;
        }        
    }
}
class graph2
{
    public void bfs(String data[][],Hashtable<String,Integer> table,int b,int c)
    {
        Queue<Integer> r = new LinkedList<Integer>();
        Queue<Integer> l = new LinkedList<Integer>();
        int x[] = {1,0,-1,0};
        int y[] ={0,-1,0,1};
        
        for(int i=1;i<=b;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(data[i][j].equals("0"))
                    continue;
                else
                {
                    if(table.get(data[i][j])==null)
                        table.put(data[i][j],1);
                    else
                        table.put(data[i][j],table.get(data[i][j])+1);
                    r.add(i);
                    l.add(j);
                    String correct = data[i][j];
                    while(r.size()!=0)
                    {
                        int d = r.poll();
                        int e = l.poll();
                        data[d][e] = "0";
                        
                        for(int k=0;k<4;k++)
                        {
                            if(data[d+y[k]][e+x[k]].equals(correct))
                            {
                                r.add(d+y[k]);
                                l.add(e+x[k]);
                            }
                        }
                    }
                }
            }
        }
        int one[] = new int[26];
        String two[] = new String[26];
        int max = 0;
        for(char ch='a';ch<='z';ch++)
        {           
            if(table.get(Character.toString(ch))==null)
                continue;
            one[(int)ch-97] = table.get(Character.toString(ch));
            two[(int)ch-97] = Character.toString(ch);
            if(one[(int)ch-97]>max)
                max = one[(int)ch-97];
        }
        for(int i=max;i>0;i--)
        {
            for(int j=0;j<26;j++)
            {
                if(one[j] == i)
                {
                    System.out.println(two[j]+": "+one[j]);
                }
            }
        }        
    }
}