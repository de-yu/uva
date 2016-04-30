
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10141 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 1;
        while(scanner.hasNextLine())
        {
            String data[] = scanner.nextLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            if(a==0)
                break;
            if(n>1)
                System.out.println();
            String str[] = new String[a];
            
            for(int i=0;i<a;i++)
                str[i] = scanner.nextLine();
            
            company com[] = new company[b];
            
            for(int i=0;i<b;i++)
            {
                String f = scanner.nextLine();
                String g[] = scanner.nextLine().split(" ");
                com[i] = new company(f,Double.parseDouble(g[0]),Integer.parseInt(g[1]));
                for(int j=0;j<com[i].n;j++)
                {
                    String aa = scanner.nextLine();
                }
            }
            String c = com[0].c;
            double d = com[0].m;
            int e = com[0].n ;
            for(int i=1;i<b;i++)
            {
                if(com[i].n>e)
                {
                    e = com[i].n;
                    d = com[i].m;
                    c = com[i].c;
                }
                else if(com[i].n==e&&com[i].m<d)
                {
                    e = com[i].n;
                    d = com[i].m;
                    c = com[i].c;
                }
            }
            System.out.printf("RFP #%d%n%s%n",n++,c);
        }  
    }
}
class company
{
    String c;
    double m;
    int n;
    public company(String str,double d,int a)
    {
        c = str;
        m = d;
        n = a;
    }
}
