

package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva836 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        for(int l=0;l<n;l++)
        {
            int length = 0,max = 0;
            ArrayList<String> list = new ArrayList<String>();
            while(scanner.hasNextLine())
            {
                s = scanner.nextLine();
                if(s.length()==0)
                    break;
                list.add(s);
            }
            length = list.get(0).length();
            Character c[][] = new Character[list.size()][length];
            int data[][] = new int[list.size()+1][length];
            
            for(int i=0;i<list.size();i++)
                for(int j=0;j<length;j++)
                    c[i][j] = list.get(i).charAt(j);
            
            for(int i=1;i<=list.size();i++)
            {
                int m = 0;
                for(int j=0;j<length;j++)
                {
                    if(c[i-1][j]=='1')
                        data[i][j] = data[i-1][j] + 1;
                    m = Math.max(data[i][j],m);
                }
                 for(int j=m;j>=1;j--)
                {
                    int sum = 0;
                    for(int k=0;k<length;k++)
                    {
                        if(data[i][k]>=j)
                            sum += j;
                        else
                            sum = 0;
                        max = Math.max(sum,max);
                    }
                }
            }
            if(l!=0)
                System.out.println();
            System.out.println(max);
        }   
    }
}
