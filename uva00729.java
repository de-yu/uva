

package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00729 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int a = scanner.nextInt();
        String str = "";
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String data[] = new String[b];
            
            for(int j=0;j<b-c;j++)
                data[j] = "0";
            for(int j=b-c;j<b;j++)
                data[j] = "1";
            backtracking bb = new backtracking();
            bb.nonMultiplePermutations(data,"");
            
            if(i!=0)
                System.out.println();
            bb.out();
        }    
    }
}
class backtracking
{
    boolean use[] = new boolean[17];
    StringBuffer sb = new StringBuffer("");
    public void nonMultiplePermutations(String data[],String answer)//data need (Arranged according to size) answer = ""
    {
        if(answer.length()==data.length)
        {
            sb.append(answer+"\n");
            return;
        }
        String last_str = "";
        for(int i=0;i<data.length;i++)
        {
            if(!use[i])
            {
                if(!data[i].equals(last_str))
                {
                    last_str = data[i];
                    use[i] = true;
                    nonMultiplePermutations(data,answer+data[i]);
                    use[i] = false;
                }
            }    
        }
    }
    public void out()
    {
        System.out.print(sb);
    }
}

