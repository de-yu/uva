package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva725 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        ArrayList<String> data[] = new ArrayList[80];
        for(int i=0;i<80;i++)
            data[i] = new ArrayList<String>();
        back b = new back();
        b.num(data, "");
        int n = 0;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            if(n>0)
                System.out.println();
            if(data[a].size()==0)
            {
                System.out.println("There are no solutions for "+a+".");
            }
            else{
                for(String s:data[a])
                {
                    System.out.printf("%s",s);
                }
            }
            n++;
        }
    }
}
class back
{
    boolean boo[] = new boolean[10];
     public void num(ArrayList<String> data[],String str)
    {       
        if(str.length()==10)
        {
            int a = Integer.parseInt(str.substring(0, 5));
            int b = Integer.parseInt(str.substring(5,10));
            if(a%b==0&&a/b>=2&&a/b<=79)
                data[a/b].add(str.substring(0, 5)+" / "+str.substring(5, 10)+" = "+ a/b +"\n");
            return;
        }
        if(str.length()>=1)
        {
            if(str.charAt(0)=='0')
                return;
        }
        for(int i=0;i<10;i++)
        {
            if(!boo[i])
            {
                boo[i] = true;
                num(data,str+Integer.toString(i));
                boo[i] = false;
            }
        }
    }
}
