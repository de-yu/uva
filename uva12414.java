
package uva4;
//使用楊輝三角形加速 因為只使用個位數 皆餘10

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva12414 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        ArrayList<Integer> data[] = new ArrayList[250];
        for(int i=0;i<250;i++)
            data[i] = new ArrayList<Integer>();
        data[0].add(1);
        data[1].add(1);
        data[1].add(1);
        
        for(int i=2;i<250;i++)
        {
            for(int j=0;j<data[i-1].size()-1;j++)
            {
                data[i].add((data[i-1].get(j)+data[i-1].get(j+1))%10);
            }
            data[i].add(1);
            data[i].add(0,1);
        }
        while(scanner.hasNext())
        {
            String str = scanner.next();
            int num[] = new int[str.length()];
            for(int i=0;i<str.length();i++)
                num[i] = (int)str.charAt(i)-65;
            boolean boo = true;
            for(int i=1;i<=10000;i++)
            {
                String s = "";
                String ans = "";
                for(int j=0;j<str.length();j++)
                {
                    num[j]++;
                    s = s + Integer.toString(num[j]);
                }
                for(int j=0;j<3;j++)
                {
                    int sum = 0;
                    for(int k=0;k<data[s.length()-3].size();k++)
                    {
                        sum = sum + ((int)s.charAt(j+k)-48)*data[s.length()-3].get(k);
                    }
                    ans = ans +Integer.toString(sum%10);
                }
                if(ans.equals("100"))
                {
                    System.out.println(i);
                    boo = false;
                    break;
                }
            }
            if(boo)
                System.out.println(":(");
        }
    }
}
