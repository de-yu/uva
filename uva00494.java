
package uva;

import java.util.*;

public class uva00494 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
            
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            
            for(int j=0;j<str.length();j++)
            {
                if((int)str.charAt(j)>=97&&(int)str.charAt(j)<=122||(int)str.charAt(j)>=65&&(int)str.charAt(j)<=90)
                    sb.append(str.charAt(j));
                else
                    sb.append(" ");
            }
            str = sb.toString();
            StringTokenizer st = new StringTokenizer(str);
            
            int n = st.countTokens();

            System.out.println(n);
          
        }    
    }
}
