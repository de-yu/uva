package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10226 
{
     public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(br.readLine());
       String str = br.readLine(); //處理第一個空行
       for(int i=0;i<a;i++)
       {
           HashMap<String,Double> map = new HashMap<String,Double>();
           TreeSet<String> set = new TreeSet<String>();
           
           int sum = 0;
           while(br.ready()) //最後一筆用EOF結束
           {
               str = br.readLine();
               if(str.equals("")) //每筆測資'前'有一個空行 以此為結束
                   break;
               if(map.get(str)==null)
                   map.put(str, 1.0);
               else
                   map.put(str, map.get(str)+1);
               set.add(str);
               sum++;
           }
           if(i!=0)
               System.out.println();
           StringBuffer sb = new StringBuffer();
           for(String s:set)
           {
               sb.append(s+" ");
               Formatter fm = new Formatter();
               fm.format("%.4f%n",(map.get(s)/sum*100));
               sb.append(fm.toString());
           }
          System.out.print(sb);
       }    
    }
}
