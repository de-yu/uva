
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11360 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a = scanner.nextInt();
            int data[][] = new int[a][a];
            
            for(int j=0;j<a;j++)
            {
                String str = scanner.next();
                for(int k=0;k<a;k++)
                    data[j][k] = (int)str.charAt(k)-48;
            }
            
            int b = scanner.nextInt();
            for(int j=0;j<b;j++)
            {
                String s = scanner.next();
                if(s.equals("row"))
                {
                    int aa = scanner.nextInt()-1;
                    int bb = scanner.nextInt()-1;
                    for(int d=0;d<a;d++)
                    {
                         data[aa][d] = data[aa][d]^data[bb][d];
                        data[bb][d] = data[aa][d]^data[bb][d];
                        data[aa][d] = data[aa][d]^data[bb][d];
                    }
                }
                else if(s.equals("col"))
                {
                    int aa = scanner.nextInt()-1;
                    int bb = scanner.nextInt()-1;
                    for(int d=0;d<a;d++)
                    {
                         data[d][aa] = data[d][aa]^data[d][bb];
                        data[d][bb] = data[d][aa]^data[d][bb];
                        data[d][aa] = data[d][aa]^data[d][bb];
                       
                    }
                }
                else if(s.equals("inc"))
                {
                    for(int d=0;d<a;d++)
                        for(int e=0;e<a;e++)
                        {
                            data[d][e]++;
                            data[d][e] = data[d][e]%10;
                        }
                }
                else if(s.equals("dec"))
                {
                      for(int d=0;d<a;d++)
                        for(int e=0;e<a;e++)
                        {
                            data[d][e]--;
                            data[d][e] = (data[d][e]==-1?9:data[d][e]);
                        }
                }
                else if(s.equals("transpose"))
                {
                    int trans[][] = new int[a][a];
                     for(int d=0;d<a;d++)
                        for(int e=0;e<a;e++)
                            trans[d][e] = data[e][d];
                     for(int d=0;d<a;d++)
                        for(int e=0;e<a;e++)
                            data[d][e] = trans[d][e];
                }
            }
            StringBuilder sb = new StringBuilder("Case #"+i+"\n");
            for(int d=0;d<a;d++)
            {
                for(int e=0;e<a;e++)
                    sb.append(data[d][e]);
                sb.append("\n");
            }
            System.out.println(sb);
        }
    } 
}
