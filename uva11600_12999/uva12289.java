
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class uva12289 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
        String str[] ={"one","two","three"};
        int a[] ={1,2,3};
            
        int b = scanner.nextInt();
        
        for(int i=0;i<b;i++)
        {
            try{
            String s = scanner.next();
            int correct = 0;
            
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<str[j].length();k++)
                {
                    if(str[j].charAt(k)==s.charAt(k))
                        correct++;
                }
                if(correct==s.length()-1||correct==s.length())
                {
                    System.out.println(a[j]);
                    break;
                }
                correct = 0;
            }
            }
            catch(Exception e)
            {
                continue;
            }    
        } 
    }        
}
