
package uva2;

import java.io.*;
import java.lang.Math.*;
import java.math.*;
import java.text.*;
import java.util.*;
public class uva12405 
{
   public static void main(String[] args)throws IOException
    {    
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));       
        
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        String str = "";
        int out = 0;
        Space s = new Space();
        for(int i=1;i<=a;i++)
        {
            b = Integer.parseInt(scanner.nextLine());
            b = 0;
            str = scanner.nextLine();
            String k = str;
            
            if(str.length()%3==1)
                str = str + "##";
            else if(str.length()%3==2)
                    str = str + "#";
                
            int j = 0;
            char c,d,e;
            while(j+2<str.length())
            {    
                c = str.charAt(j);
                d = str.charAt(j+1);
                e = str.charAt(j+2);
                
                if(c==d&&d==e&&c=='.')
                {
                    out++;
                    str = s.White(str,j, j+2);
                }
                else
                    j++;
            }
            j = 0;
            while(j+2<str.length())
            {    
                c = str.charAt(j);
                d = str.charAt(j+1);
                e = str.charAt(j+2);
                
                if(c==d&&c=='.'||d==e&&d=='.'||c==e&&c=='.')
                {
                    out++;
                    str = s.White(str,j, j+2);
                }
                else
                    j++;
            }
            j = 0;
              while(j+2<str.length())
            {    
                c = str.charAt(j);
                d = str.charAt(j+1);
                e = str.charAt(j+2);
                
                if(c=='.'||d=='.'||e=='.')
                {
                    out++;
                    str = s.White(str,j, j+2);
                }
                else
                    j++;
            }
            System.out.println("Case "+i+": "+out);
            out = 0;
        }    
    }
}
class Space
{
    public String White(String str,int a,int b)
    {
        String s = str.substring(0,a);
        s = s + str.substring(a+3,str.length());
        return s;
    }
}