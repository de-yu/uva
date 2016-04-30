

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva271 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        while(scanner.hasNext())
        {
            String str = scanner.next();
            int sum = 0;
            
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)<='z'&&str.charAt(i)>='p')
                    sum++;
                else if(str.charAt(i)=='N')
                    sum = sum + 0;
                else if(str.charAt(i)=='C'||str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='I')
                    sum--;
                else
                {
                    sum = -1;
                    break;
                }
            }
            if(sum==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
