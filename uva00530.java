

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00530 
{
       public static void main(String[] args)throws IOException
    {
          Scanner scanner = new Scanner(System.in);
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double c = 1;
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(a==0&&b==0)
                break;
            if(b>a/2)
                b = a-b;
            
            for(int i=a,j=b;i>a-b;j--,i--)
            {
                c = c*i;
                if(c%j==0)
                    c = c/j;
                else
                    list.add(j);
            }
            for(int k:list)
            {
                c = c/k;
            }
            System.out.println((int)c);
        }
                
    }
}
