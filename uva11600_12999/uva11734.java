
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva11734 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
        int a = Integer.parseInt(scanner.nextLine());
        String one,two;
        space s = new space(); 
        for(int i=1;i<=a;i++)
        {
            one = scanner.nextLine();
            two = scanner.nextLine();
            
            if(one.equals(two))
            {
                System.out.println("Case "+i+": Yes");
                continue;
            }
            one = s.deleteSpace(one);
            two = s.deleteSpace(two);
            if(one.equals(two))
                System.out.println("Case "+i+": Output Format Error");
            else
                System.out.println("Case "+i+": Wrong Answer");
        }           
    }        
}
class space
{
    public String deleteSpace(String str)
    {
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            if(!Character.toString(str.charAt(i)).equals(" "))
                ans = ans + Character.toString(str.charAt(i));
        }
        return ans;
    }        
}

