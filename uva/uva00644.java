
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00644 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 1;
        
        while(scanner.hasNext())
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = "";
            while(!s.equals("9"))
            {
                s = scanner.next();
                list.add(s);
            }
            int length = list.size();
            boolean boo = false;
            for(int i=0;i<length;i++)
            {
                int l = list.get(i).length();
                for(int j=0;j<length;j++)
                {
                    if(i==j)
                        continue;
                    if(l>list.get(j).length())
                        continue;
                    else
                    {
                        String a = list.get(j).substring(0, l);
                        if(a.equals(list.get(i)))
                        {
                            boo = true;
                            break;
                        }
                    }
                }
                if(boo)
                    break;
            }
            
            if(boo)
                System.out.println("Set "+n+" is not immediately decodable");
            else
                System.out.println("Set "+n+" is immediately decodable");
            n++;
        }
    }
}
