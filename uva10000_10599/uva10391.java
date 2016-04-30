

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva10391 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String ,Integer> map = new HashMap<String , Integer>();
        String data[] = new String[120001];
        int max = 0;
        
        while(scanner.hasNextLine())
        {
            data[max] = scanner.nextLine();
            map.put(data[max] , 1);
            max++;
        }
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<max;i++)
        {
            int l = data[i].length();
            for(int j=1;j<l;j++)
            {
                String s1 = data[i].substring(0,j);
                String s2 = data[i].substring(j, l);
                if(map.get(s1)==null||map.get(s2)==null)
                {
                   continue;
                }
                else
                {
                     sb.append(data[i]+"\n");
                    break;
                }
            }
        }
        System.out.print(sb);
       
    }
}
