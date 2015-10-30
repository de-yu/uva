

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10776 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
      
        while(scanner.hasNext())
        {
            String s = scanner.next();
            int a = scanner.nextInt();
            sb = new StringBuilder("");
            use = new boolean[s.length()];
            String data[] = new String[s.length()];
            
            for(int i=0;i<s.length();i++)
                data[i] = Character.toString(s.charAt(i));
            Arrays.sort(data);
          
            combination(data,"",a,0);
            System.out.print(sb);
        }
    }
    static StringBuilder sb;
    static boolean use[];            
    public static void combination(String data[],String answer,int choose,int n)//first answer is "" n = 0;
    {
         if(answer.length()==choose)
        {
            sb.append(answer+"\n");
            return;
        }
        String last_str = "";
        for(int i=n;i<data.length;i++)
        {
            if(!use[i])
            {
                 if(!data[i].equals(last_str))
                {
                    last_str = data[i];
                    use[i] = true;
                    combination(data,answer+data[i],choose,i+1);
                    use[i] = false;
                }
            }    
        }
    }
}
