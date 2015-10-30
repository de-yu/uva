
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva00583 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        ArrayList<Integer> data = new ArrayList<Integer>();
        int num[] = new int[46342];
        
        for(int i=2;i<46342;i++)
        {
            if(num[i]==0)
            {
                for(int j=i*i;j<46342;j+=i)
                    num[j] = 1;
            }
        }
        for(int i=2;i<46342;i++)
        {
           if(num[i]==0)
               data.add(i);
        }
        
        StringBuilder sb = new StringBuilder("");
        while(true)
        {
            int a = Integer.parseInt(br.readLine());
            int b = Math.abs(a);
            if(a==0)
                break;
            boolean boo = true;
            if(prime(data,b))
                boo = true;
            else
                    boo = false;
            sb.append(a+ " = ");
            if(boo)
            {
                if(a<0)
                    sb.append("-1 x ");
                sb.append(b);
            }
            else
            {
                if(a<0)
                     sb.append("-1 x ");
                boolean first = true;
                for(int i:data)
                {
                    if(i>b)
                        break;
                    while(b%i==0)
                    {
                        if(first)
                        {
                            sb.append(i);
                            first = false;
                        }
                        else
                            sb.append(" x "+i);
                        b = b/i;
                    }
                }
            }
            if(b!=1&&!boo)
                 sb.append(" x "+b);
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static boolean prime(ArrayList<Integer> data,int a)
    {
        boolean boo = true;
        for(int i:data)
        {
                if(i*i>a)
                    break;
                if(a%i==0)
                {
                    boo = false;
                    break;
                }
        }
        return boo;
    }
}
