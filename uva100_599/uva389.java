package uva100_599;
import java.io.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class uva389 
{
    public static void main(String[] args)throws IOException
    {    
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));       
       
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNext())
        {    
            String a = scanner.next();

            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            Change ch = new Change();
            int d = ch.ans(a, b);
            String e = Integer.toString(d, c);
            
            if(e.length()>7)
            {
               sb.append("  ERROR\n");
            }
            else
            {    
            for(int i=0;i<7;i++)
            {
                if(e.length()==7)
                    break;
                e = " " + e;
            }
             sb.append(e.toUpperCase()+"\n");
            }
        }
        System.out.print(sb);
 
    }
}
class Change
{
    char c[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    int d[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    public int ans(String str,int a)
    {
        String n = "";
        for(int i=str.length()-1;i>=0;i--)
            n = n + Character.toString(str.charAt(i));
        int b = 0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='0')
                    continue;
            for(int j=0;j<15;j++)
            {                
                if(n.charAt(i)==c[j])
                {
                    b = b + d[j]*(int)Math.pow(a,i);
                    break;
                }    
            }    
        }
        return b;
    }        
}