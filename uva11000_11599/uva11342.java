

package uva11000_11599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11342 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
        
        int data[][] = new int[50001][3];
        
        for(int i=0;i<Math.sqrt(50000);i++)
            for(int j=0;j<Math.sqrt(50000);j++)
                for(int k=0;k<Math.sqrt(50000);k++)
                {
                    int sum = i*i+j*j+k*k;
                    if(sum>50000)
                        break;
                    if(data[sum][0]==0&&data[sum][1]==0&&data[sum][2]==0)
                    {
                        data[sum][0] = i;
                        data[sum][1] = j;
                        data[sum][2] = k;
                    }
                }
        int a = scanner.nextInt();
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
             if(data[b][0]==0&&data[b][1]==0&&data[b][2]==0)
                 sb.append("-1\n");
             else
                 sb.append(data[b][0]+" "+data[b][1]+" "+data[b][2]+"\n");
        }
        System.out.print(sb);
    }
}
