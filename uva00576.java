
package uva3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00576 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            if(str.equals("e/o/i"))
                break;
            String data[] = str.split("/");
            inspect in = new inspect();
            for(int i=0;i<3;i++)
            {
                   if(in.spect(data[i], (i==1?7:5)))
                   {
                       System.out.println(i+1);
                       break;
                   }
                   if(i==2)
                       System.out.println("Y");
            }    
        }
        
    }   
}
class inspect
{
    char cc[] = {'a','e','i','o','u','y'};
    public boolean spect(String str,int n)
    {
        boolean bb = false;
        int sum = 0;
        for(int i=0;i<str.length();i++)
        {
            if(word(str.charAt(i))&&bb)
                continue;
            else
                bb = false;
            if(word(str.charAt(i)))
            {
                sum++;
                bb = true;
            }    
        }
        if(sum==n)
            return false;
        else
            return true;
    }
    private boolean word(char c)
    {
        for(int i=0;i<6;i++)
        {
            if(c==cc[i])
                return true;
        }
        return false;
    }        
}
