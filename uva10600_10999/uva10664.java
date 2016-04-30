
package uva10600_10999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10664 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int data[] = new int[st.countTokens()];
            int sum = 0;
            for(int i=0;i<data.length;i++)
            {
                data[i] = Integer.parseInt(st.nextToken());
                sum += data[i];
            }
            if(sum%2==1)
                System.out.println("NO");
            else
            {
                int leng = data.length;
                int answer[] = new int[sum+1];
                answer[0] = answer[sum] = 1;
                for(int i=0;i<leng;i++)                    
                {
                    for(int j=sum;j>=data[i];j--)
                        if(answer[j-data[i]]==1)
                            answer[j] = 1;
                }
                
                if(answer[sum/2]==1)
                     System.out.println("YES");
                else
                     System.out.println("NO");
                    
            }
        }
    } 
}
