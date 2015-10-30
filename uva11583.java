
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11583 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = Integer.parseInt(br.readLine());
        while(n-->0)
        {
            int a = Integer.parseInt(br.readLine());
            int sum = 0, before = Integer.MAX_VALUE,after = 0;
            
            for(int i=0;i<a;i++)
            {
                String str = br.readLine();
                for(int j=0;j<str.length();j++)
                {
                    after = after | (int)Math.pow(2, (int)str.charAt(j)-97);
                   
                }
                if((after&before)!=0)
                    before = after&before;
                else
                {
                    before = after;
                    sum++;
                }
                after = 0;
            }
            System.out.println(sum);
        }
    }
}
