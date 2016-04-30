
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva344 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        String s1[] = {"","i","ii","iii","iv" ,"v" , "vi" ,"vii" ,"viii" , "ix"};
        String s2[] = {"","x","xx" ,"xxx" ,"xl" ,"l","lx" ,"lxx" ,"lxxx" ,"xc"};
        char a[] = {'i' , 'v' , 'x' ,'l' ,'c'};
        
        int data[][] = new int[101][5];
        
        for(int i=1;i<=99;i++)
        {
            for(int j=0;j<5;j++)
                data[i][j] = data[i-1][j];
            String s = s1[i%10] + s2[i/10];
            for(int j=0;j<s.length();j++)
            {
                for(int k=0;k<5;k++)
                {
                    if(s.charAt(j)==a[k])
                        data[i][k]++;
                }
            }
        }
        for(int k=0;k<5;k++)
        {
            data[100][k] = data[99][k];
        }        
        data[100][4]++;
        
        while(scanner.hasNextInt())
        {
            int n = scanner.nextInt();
            
            if(n==0)
                break;
            
            StringBuilder sb = new StringBuilder("");
            sb.append(n+": ");
            
            for(int i=0;i<5;i++)
            {
                if(i==4)
                    sb.append(data[n][i]+" "+a[i]);                
                else
                    sb.append(data[n][i]+" "+a[i]+", ");
            }
            
            System.out.println(sb);
        }
    }
}
