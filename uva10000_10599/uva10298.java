
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10298 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNext())
        {
            String str = scanner.next();
           
            if(str.equals("."))
                break;
            boolean a = false,b = false;
            
            for(int i=1;i<str.length();i++)
            {
                a = false;
                b = false;
                if(str.length()%i==0)
                {
                    for(int j=0;;j=j+i)
                    {
                        if(j+i>=str.length())
                            break;
                        if(!(str.substring(j,j+i).equals(str.substring(j+i, j+2*i))))
                        {  
                            a = true;
                        }
                        if(a)
                            break;
                    }
                    b = true;
                }
                if(!a&&b){
                   sb.append(str.length()/i+"\n");
                    break;
                }
                else if(i==str.length()-1)
                {
                   sb.append("1\n");
                }
            }
        }
        System.out.print(sb);
    }
}
