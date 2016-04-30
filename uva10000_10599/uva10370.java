
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10370 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int b = Integer.parseInt(st.nextToken());
            int data[] = new int[b];
            
            double sum = 0.0;
            for(int j=0;j<b;j++)
            {
                data[j] = Integer.parseInt(st.nextToken());
                sum = sum + data[j];
            }
            sum = sum/b;
            double c = 0.0;
            for(int j=0;j<b;j++)
            {
                if(data[j]>sum)
                    c++;
            }
            System.out.printf("%.3f",c/b*100);
            System.out.println("%");
        }
    }
}
