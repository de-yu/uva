
package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00102 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
      
        String data[] = {"BCG","BGC","CBG","CGB","GBC","GCB"};
        int num[] = new int[9];
        while(scanner.hasNextInt())
        {
            int min = 2147483647, a = 0;
            String s = "";
            for(int i=0;i<9;i++)
            {
                num[i] = scanner.nextInt();
                a = a + num[i];
            }
            for(int i=0;i<6;i++)
            {
                int sum = a;
                for(int j=0;j<3;j++)
                {
                    if(data[i].charAt(j)=='B')
                        sum = sum - num[j*3];
                    if(data[i].charAt(j)=='G')
                        sum = sum - num[1+j*3];
                    if(data[i].charAt(j)=='C')
                        sum = sum - num[2+j*3];
                }
                if(sum<min)
                {
                    min = sum;
                    s = data[i];
                }
            }
            System.out.println(s+" "+min);
        }
    }
}
