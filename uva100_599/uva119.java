
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva119 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int amount = 0;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            String data[] = new String[a];
            for(int i=0;i<a;i++)
            {
                String str = scanner.next();
                data[i] = str;
                map.put(str, 0);
            }
            
            for(int i=0;i<a;i++)
            {
                String s = scanner.next();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if(c==0)
                    continue;
                int n = map.get(s)-b/c*c;
                map.put(s,n);
                for(int j=0;j<c;j++)
                {
                    String d = scanner.next();
                    n = map.get(d)+b/c;
                    map.put(d,n);
                }                
            }
            StringBuffer sb = new StringBuffer("");
            for(int i=0;i<a;i++)
            {
                sb.append(data[i]+" "+map.get(data[i])+"\n");
            }
            if(amount>0)
                System.out.println();
            System.out.print(sb);
            amount++;
        }
    }
}
