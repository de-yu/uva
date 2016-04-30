
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva499 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            int data[][] = new int[2][26];
            int max = 0;
            for(int i=0;i<str.length();i++)
            {
                int n = (int)str.charAt(i);
                if(n<=122&&n>=97)
                {
                    data[1][n-97]++;
                    max = Math.max(max, data[1][n-97]);
                }
                else if(n<=90&&n>=65)
                {
                    data[0][n-65]++;
                    max = Math.max(max, data[0][n-65]);
                }
            }
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<26;j++)
                {
                    if(data[i][j]==max)
                        System.out.print((char)(j+65+32*i));
                }
            }
            System.out.println(" "+max);
        }
    }
}
