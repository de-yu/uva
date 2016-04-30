

package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva343 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        for(char c='0';c<='9';c++)
            map.put(c , (int)c-48);
        for(char c='A';c<='Z';c++)
            map.put(c, (int)c-55);
        
        
        while(scanner.hasNext())
        {
            String a = scanner.next()
                    ,b = scanner.next();
            long a_num[] = new long[37];
            long b_num[] = new long[37];
            int left = min_h(map , a)
                ,right = min_h(map , b);
            
            for(int i=left;i<37;i++)
                a_num[i] = hex(map , a , i);
            for(int i=right;i<37;i++)
                b_num[i] = hex(map , b , i);
            boolean ans = false;
            out:
            for(int i=left;i<37;i++){
                for(int j=right;j<37;j++){
                    if(a_num[i]==b_num[j])
                    {
                        System.out.printf("%s (base %d) = %s (base %d)%n" , a , i , b , j);
                        ans = true;
                        break out;
                    }
                }
            }
            if(!ans)
                System.out.printf("%s is not equal to %s in any base 2..36%n" , a,b);
        }
    }
    public static int min_h(HashMap<Character , Integer> map,String a)
    {
        int min = 1,length = a.length();
        for(int i=0;i<length;i++)
            min = Math.max(min , map.get(a.charAt(i)));
        return min+1;
    }
    public static long hex(HashMap<Character , Integer> map,String a , int h)
    {
        int length = a.length();
         long sum = 0;
        
        for(int i=0;i<length;i++)
        {
            sum += map.get(a.charAt(i))*Math.pow(h,length-i-1);
        }
        return sum;
    }
}
