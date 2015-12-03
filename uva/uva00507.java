

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00507 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder("");
        for(int i=1;i<=n;i++)
        {
            
            int a = scanner.nextInt();
            int road[] = new int[a-1];
            
            for(int j=0;j<a-1;j++)
                road[j] = scanner.nextInt();
            
            int sum = 0, max = 0;
            int start = 0,start1 = 0,end = 0 ,length = 0;
            for(int j=0;j<a-1;j++)
            {
                sum += road[j];
                if(sum<0)
                {  
                    sum = 0;
                    start = j+1;
                }
                if(sum>=max&&sum!=0)
                {
                    if(sum>max)
                    {
                        length = (j+2) - start;
                        start1 = start+1;
                        end = j+2;
                    }
                    else
                    {
                        if((j+2)-start>length)
                        {
                            length = (j+2) - start;
                            start1 = start+1;
                            end = j+2;
                        }
                    }
                    max = sum;
                    
                }
            }
                if(length!=0)
                    sb.append("The nicest part of route "+i+" is between stops "+start1+" and "+end+"\n");
                else
                    sb.append("Route "+i+" has no nice parts\n");
        }
        System.out.print(sb);
    }
}
