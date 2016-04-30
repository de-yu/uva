
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva306 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            int data[] = new int[a];
            int position[] = new int[a];
            int pp[][] = new int[a][a];
            int sum[] = new int[a];
            for(int i=0;i<a;i++)
                data[i] = scanner.nextInt() - 1; 
            pos(data,position,sum,a);
            
            for(int j=0;j<a;j++)
                pp[0][j] = position[j];
            for(int i=1;i<a;i++)
            {             
                for(int j=0;j<a;j++)
                    pp[i][j] = pp[i-1][position[j]];   
            }
            
            StringBuilder sb = new StringBuilder("");
            while(scanner.hasNextInt())
            {
                int b = scanner.nextInt();
                if(b==0)
                    break;
                b--;
                String s = scanner.nextLine();
                Character alph[] = new Character[a];
                Character answer[] = new Character[a];
                for(int i=1;i<=a;i++)
                {
                    if(i>=s.length())
                        alph[i-1] = (char)32;
                    else
                        alph[i-1] = s.charAt(i);
                }
                for(int i=0;i<a;i++)
                    sb.append(alph[pp[b%sum[i]][i]]);
                sb.append("\n");
            }
            System.out.println(sb);
     }
    }
    public static void pos(int data[],int position[],int sum[],int a)
    {
        for(int i=0;i<a;i++)
        {
            int pos = data[i];
            int s = 1;
            
            while(pos!=i)
            {
                if(data[pos]==i)
                {
                    s++;
                    break;
                }
                pos = data[pos];
                s++;
            }
            sum[i] = s;
            position[i] = pos;
        }
    }
}
