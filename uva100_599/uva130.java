
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva130 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int data[] = new int[a];
            for(int i=0;i<a;i++)
                data[i] = i;
            if(a==0)
                break;
            if(a==1)
            {
                System.out.println("1");
            }
            else
            {
                int start = 0,times = 0,del = 0,answer = 0,i = -1,before = -1;
                while(del!=(a-1)*2)
                {
                    times = 0;
                    if(del%2==0)
                    {
                        i = before;
                        while(times!=b)
                        {                     
                            i = (i + 1)%a;
                            if(data[i]>=0)
                                times++;
                        }
                        before = i;
                        data[i] = -1;
                    }
                    else
                    {
                        while(times!=b)
                        {                     
                            i = (i + 1)%a;
                            if(data[i]>=0)
                                times++;
                        }
                        data[i] = data[before]^data[i];
                        data[before] = data[before]^data[i];
                        data[i] = data[before]^data[i];
                    }
                    del++;
                }
                for(i=0;i<a;i++)
                    if(data[i]>=0)
                        answer = data[i];
                int sum = 0;
                while(answer!=0)
                {
                    answer = (answer + 1)%a; 
                    sum++;
                }
                System.out.println(sum+1);
            }
        }
    }
}
