

package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva673 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            String str = br.readLine();
            boolean boo = true;
            Stack<Character> s = new Stack<Character>();
            int l = str.length();
            for(int i=0;i<l;i++)
            {
                if(str.charAt(i)=='['||str.charAt(i)=='(')
                    s.add(str.charAt(i));
                else if(str.charAt(i)==']'||str.charAt(i)==')')
                {
                    if(s.empty())
                    {
                        boo = false;
                        break;
                    }
                    Character c = s.pop();
                    if(c=='('&&str.charAt(i)==']'||c=='['&&str.charAt(i)==')')
                    {
                       boo = false;
                       break;
                    }
                }
            }
            if(boo&&s.empty())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    } 
}
