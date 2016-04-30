
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva483
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           StringTokenizer st = new StringTokenizer(str);
           int n = st.countTokens();
           String data[] = new String[n];
           
           for(int i=0;i<n;i++)
           {
               data[i] = verse(st.nextToken());
           }
           StringBuffer sb = new StringBuffer(data[0]);
           
           for(int i=1;i<n;i++)
               sb.append(" "+data[i]);
           System.out.println(sb);
       }
    }
    public static String verse(String s)
    {
        StringBuffer sb = new StringBuffer("");
        
        for(int i=s.length()-1;i>=0;i--)
            sb.append(s.charAt(i));
        
        return sb.toString();
    }
}