
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10282 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
     
        HashMap<String,String> map = new HashMap<String,String>();
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            if(s.length()==0)
                break;
            StringTokenizer st = new StringTokenizer(s);
            String data[] = {st.nextToken(),st.nextToken()};
            map.put(data[1],data[0]);            
        }
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            String str = map.get(s);
           sb.append(str==null?"eh\n":str+"\n");
        }
        System.out.print(sb);
    }
}
