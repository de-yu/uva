
package uva11000_11599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11278 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Character , Character> map = new HashMap<Character , Character>();
        
        String a = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./ ~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?";
        String b = "`123qjlmfp/[]456.orsuyb;=\\789aehtdck-0zx,inwvg' ~!@#QJLMFP?{}$%^>ORSUYB:+|&*(AEHTDCK_)ZX<INWVG\"";
        
        for(int i=0;i<a.length();i++)
            map.put(a.charAt(i),b.charAt(i));
        
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0;i<str.length();i++)
                sb.append(map.get(str.charAt(i)));
            System.out.println(sb);
        }
    }
}
