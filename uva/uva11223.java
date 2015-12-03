
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11223 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String , String> map = new HashMap<String , String>();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,?'!/()&:;=+-_\"@ ";
        String value[] = {".-" , "-..." , "-.-.","-..",".","..-.",
        "--.","....","..",
        ".---","-.-",".-..",
        "--","-.","---",
        ".--.","--.-",".-.",
        "...","-","..-",
        "...-",".--","-..-",
        "-.--","--..","-----",
        ".----","..---","...--",
        "....-",".....","-....",
        "--...","---..","----.",
        ".-.-.-","--..--","..--..",
        ".----.","-.-.--","-..-.",
        "-.--.","-.--.-",".-...",
        "---...","-.-.-.","-...-",
        ".-.-.", "-....-", "..--.-",
        ".-..-.",".--.-.","space"};
        
        for(int i=0;i<value.length;i++)
        {
            String c = Character.toString(alpha.charAt(i));
            map.put(value[i] , c);
        }
      
        int n = Integer.parseInt(scanner.nextLine());
        
        for(int i=1;i<=n;i++)
        {
            String s = scanner.nextLine();
            StringBuilder exam = new StringBuilder("");
            
            for(int j=0;j<s.length();j++)
            {
                char c = s.charAt(j);
                if(c==' '&&s.charAt(j-1)==' ')
                    exam.append("space ");
                else
                    exam.append(c);
            }
            s = exam.toString();

            StringTokenizer st = new StringTokenizer(s);
            StringBuilder sb = new StringBuilder("Message #"+i+"\n");
            
            while(st.hasMoreTokens())
            {
                String ans = map.get(st.nextToken());
                sb.append(ans);
            }
            if(i!=1)
                System.out.println();
            System.out.println(sb);
        }
    }
}
