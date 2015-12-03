
package uva;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva00133 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a==0)
                 break;
            
            int data[] = new int[a+1];
            int sum = 0,head = 0,tail = 0 ,posh = 0 ,post = a+1;
            Formatter fm = new Formatter();
            
            while(sum!=a)
            {
                for(;;)
                {
                   posh = (posh==a+1?1:posh);

                    if(data[posh%a+1]==0)
                        head++;
                    posh++;
                    if(head==b)
                    {
                        posh = (posh==a+1?1:posh);
                        break;
                    }
                }
                for(;;)
                {
                    post = (post<1?a:post);

                     if(data[(post-1<1?a:post-1)]==0)
                        tail++;
                     
                     if(post-1<1)
                        post = a;
                     else
                        post--;
                    if(tail==c)
                        break;
                }

                data[posh] = data[post] = 1;
                head = tail = 0;
                if(posh!=post)
                {
                    fm.format("%3d%3d,",posh,post);
                    sum+=2;
                }
                else
                {
                     fm.format("%3d,",posh);
                     sum++;
                }
            }
            
            String s = fm.toString();
            System.out.println(s.substring(0, s.length()-1));
        }  
    }
}
