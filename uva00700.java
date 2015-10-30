package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00700 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int s = 1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            if(a==1)
            {
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                out(s,b);
                s++;
                continue;              
            }
            int year[] = new int[a];
            int num[] = new int[a];
            int big[] = new int[a];
            ArrayList<Integer> data = new ArrayList<Integer>();
            for(int i=0;i<a;i++)
            {
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                year[i] = b;
                num[i] = Math.abs(c-d);
                big[i] = c;
            }
            math(year[0],num[0],year[1],num[1],data);
            boolean boo[] = new boolean[data.size()];
            boolean bb = true;
             
            for(int i=0;i<data.size();i++)
            {
                boolean bbb = false;
                for(int j=0;j<a;j++)
                {
                    if(data.get(i)<big[j]){
                        bbb = true;
                        break;
                    }
                    if(!((data.get(i)-year[j])%num[j]==0))
                        boo[i] = true;
                }
                if(bbb)
                    continue;
                if(boo[i]==false)
                {
                    out(s,data.get(i));
                    bb = false;
                    break;
                }
                if(bb==false)
                    break;
            }
            if(bb)
            out(s,-1);
            s++;
        }
        
    } public static void math(int a,int b,int c,int d,ArrayList<Integer> data)
        {
            while(a<10000&&c<10000)
            {
                if(a<c)
                    a = a + b;
                else if(c<a)
                    c = c + d;
                else if(a==c)
                {
                    data.add(a);
                    a = a + b;
                    c = c + d;                   
                }
            }
        }
        public static void out(int s,int n)
        {  
            System.out.println("Case #"+s+":");
            if(n==-1)
                System.out.println("Unknown bugs detected.\n");
            else
                System.out.println("The actual year is "+n+".\n");
        }
}
