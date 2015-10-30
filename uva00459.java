/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva00459 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int k=0;k<n;k++)
        {
            str = br.readLine();
            int size = (int)str.charAt(0)-65+1;
            int sum = 0;
            boolean boo[] = new boolean[size];
            int data[][] = new int[size][size];
            while(str.length()!=0)
            {
                str = br.readLine();
                if(str.length()==0)  break;
                int a = (int)str.charAt(0)-65;
                int b = (int)str.charAt(1)-65;
                data[a][b] = 1;
            }
            Queue<Integer> q = new LinkedList<Integer>();

            for(int j=0;j<size;j++)
            {
                if(!boo[j])
                {
                    q.add(j);
                    sum++;
                    while(q.size()!=0)
                    {
                        int num = q.poll();
                        boo[num] = true;
                        for(int i=0;i<size;i++)
                        {
                            if(!boo[i]&&((data[num][i]==1)||(data[i][num]==1)))
                                q.add(i);  
                        }
                        
                    }
                }
            }
            if(k!=0)
                System.out.println();
            System.out.println(sum);
        }
    }
}
