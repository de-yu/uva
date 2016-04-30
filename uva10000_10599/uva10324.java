
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10324 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       int n = 0;
        while(scanner.hasNext())
        {
            String str = scanner.next();
            StringBuffer sb = new StringBuffer("");
            int data[] = new int[str.length()];
            for(int i=0;i<str.length();i++)
                data[i] = (str.charAt(i)=='0'?0:1);
            int a = scanner.nextInt();
            for(int i=0;i<a;i++)
            {
                int b = scanner.nextInt();
                int c = scanner.nextInt();
              
                if(c<b)
                {
                    b = b^c;
                    c = b^c;
                    b = b^c;
                }
                if(c>=str.length())
                {
                    sb.append("No\n");
                    continue;
                }
                int sum = 0;
                for(int j=b;j<=c;j++)
                    sum += data[j];
                if(sum==0||sum==(c-b+1))
                    sb.append("Yes\n");
                else
                    sb.append("No\n");
            }
            System.out.printf("Case %d:%n",++n);
            System.out.print(sb);
        }
    }
}
