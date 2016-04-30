
package uva100_599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva160 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<String> ans = new ArrayList<String>();
        int num[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,57,61,67,71,73,79,83,89,97};
        for(int i=0;i<25;i++)
            data.add(0);                
        data.set(0,1);
        ans.add("  1");
        for(int i=3;i<=100;i++)
        {
             StringBuffer sb = new StringBuffer("");
            for(int j=0;j<25;j++)
            {
                int a = 0;
                int b = i;
                while(b%num[j]==0)
                {
                    a++;
                    b = b/num[j];                 
                }
                data.set(j,data.get(j)+a);
            }
            for(Integer n:data)
            {
                if(n==0)
                    continue;
                if(Integer.toString(n).length()==1)
                    sb.append("  "+Integer.toString(n));
                else if(Integer.toString(n).length()==2)
                    sb.append(" "+Integer.toString(n));
            }
            ans.add(sb.toString());
        }    
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
               break;
            String str = ans.get(a-2);
             System.out.printf("%3d! =",a);
            if(str.length()<46)
                System.out.println(str);
            else{
                System.out.println(str.substring(0, 45));
                System.out.println("      "+str.substring(45,str.length()));
            }
                
        }       
    }   
}
