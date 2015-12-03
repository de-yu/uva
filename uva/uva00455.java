

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva00455 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        for(int j=0;j<n;j++)
        {
            String str = scanner.next();
            String s = "";
            if(j!=0)
                System.out.println();
            for(int i=2;i<=str.length();i+=2)
            {
                if(str.substring(0,i/2).equals(str.substring(i/2, i)))
                {
                    s = str.substring(0,i/2);
                    break;
                }
            }
            if(s.equals(""))
                System.out.println(str.length());
            else if(str.length()%s.length()!=0)
                System.out.println(str.length());
            else
            {
                int length = s.length();
                boolean boo = true;
                
                for(int i=0;i<str.length();i+=length)
                {
                    if(!(str.substring(i, i+length).equals(s)))
                    {
                        boo = false;
                        break;
                    }
                }
                if(boo)
                    System.out.println(s.length());
                else
                    System.out.println(str.length());
            }
        }
    }
}
