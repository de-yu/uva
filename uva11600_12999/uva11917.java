

package uva11600_12999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11917 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a = scanner.nextInt();
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            for(int j=0;j<a;j++)
                map.put(scanner.next(),scanner.nextInt());
            
            int b = scanner.nextInt();
            String sub = scanner.next();
            
            if(map.get(sub)==null||map.get(sub)>b+5)
                System.out.printf("Case %d: Do your own homework!%n",i);
            else
            {
                if(map.get(sub)<=b)
                    System.out.printf("Case %d: Yesss%n",i);
                else
                    System.out.printf("Case %d: Late%n",i);
            }
            
        }
    }
}
