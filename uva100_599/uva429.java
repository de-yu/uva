
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva429 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        while(n-->0)
        {
            
            String words[] = new String[300];
            int index = 0;
            StringBuilder sb = new StringBuilder("");
            while(!str.equals("*"))
            {
                str = scanner.nextLine();
                words[index] = str;
                index++;
            }
            while(scanner.hasNextLine())
            {
                str = scanner.nextLine();
                if(str.equals(""))
                    break;
                
                String data[] = str.split(" ");
                int start = 0, end = 0;
                
                for(int i=0;i<index;i++)
                {
                    if(data[0].equals(words[i]))
                        start = i;
                    if(data[1].equals(words[i]))
                        end = i;
                }
                min = 500;
                boolean boo[] = new boolean[index];
                str_analysis(start , end ,0 , index , words , boo);
                sb.append(str + " " + min+"\n");
            }
            if(n==0)
              System.out.print(sb);
            else
              System.out.println(sb);
        }
    }
    static int min;
    public static void str_analysis(int start , int end , int layer, int index , String data[] , boolean boo[])
    {
        if(start == end){
            min = Math.min(min , layer);
            return;
        }
        
        for(int i=0;i<index;i++)
        {
            if(data[start].length() != data[i].length()){
                continue;
            }
            else
            {
                if(!boo[i]){
                    if(str_comparision(data[start] , data[i])==1)
                    {
                        boo[i] = true;
                        str_analysis(i , end ,  layer+1 , index , data , boo);
                        boo[i] = false;
                    }
                }
            }
        }
    }
    public static int str_comparision(String a , String b)
    {
        int length = a.length();
        int diff = 0;
        for(int i=0;i<length;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
                diff++;
        }
        
        return diff;
    }
}
