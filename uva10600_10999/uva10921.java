package uva10600_10999;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10921
{   
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int data[] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer("");
            for(int i=0;i<str.length();i++)
            {
                if((int)str.charAt(i)>=65&&(int)str.charAt(i)<=90)
                    sb.append(data[(int)str.charAt(i)-65]);
                else
                    sb.append(str.charAt(i));
            }
            System.out.println(sb);
        }    
    }    
}
