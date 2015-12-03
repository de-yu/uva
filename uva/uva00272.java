
package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva00272 
{
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 0;
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer("");
            
            for(int i=0;i<str.length();i++)
            {
                if((int)str.charAt(i)==34)
                {
                    if(n%2==0)
                        sb.append("``");
                    else
                        sb.append("\'\'");
                    n++;
                }
                else
                    sb.append(str.charAt(i));    
            }
            System.out.println(sb);
        }    
    }    
}
