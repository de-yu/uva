

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00679 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        StringBuilder sbb = new StringBuilder("");
        while(n-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            
            String two = Integer.toString(b,2);

            while(two.length()!=a)
            {
                two = "0" + two;
            }

            int ans = 1;

            for(int i=two.length()-1;i>=0;i--)
            {
                if(two.charAt(i)=='0')
                    ans = ans*2;
                else
                    ans = ans*2 + 1;
            }
            sbb.append(ans+"\n");
        }
        System.out.print(sbb);
    }
}
