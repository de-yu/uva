
package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva443 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));            
      
        TreeSet<Long> set = new TreeSet<Long>();
        ArrayList<Long> data = new ArrayList<Long>();
        set.add(1L);
        while(data.size()<5842)
        {
            Long a = set.pollFirst();
            set.add(a*2);
            set.add(a*3);
            set.add(a*5);
            set.add(a*7);
            data.add(a);        
        }
        StringBuffer sb = new StringBuffer("");
        while(scanner.hasNext())
        {
            String s = scanner.next();
            if(s.equals("0"))
                break;
            if(s.equals("111")||(Integer.parseInt(s)%100<=20&&Integer.parseInt(s)%100>=11))
            {
                sb.append("The "+s+"th humble number is "+data.get(Integer.parseInt(s)-1)+".\n");
                continue;
            }
            if(s.charAt(s.length()-1)=='1')
                sb.append("The "+s+"st humble number is "+data.get(Integer.parseInt(s)-1)+".\n");
            else if(s.charAt(s.length()-1)=='2')
                sb.append("The "+s+"nd humble number is "+data.get(Integer.parseInt(s)-1)+".\n");    
            else if(s.charAt(s.length()-1)=='3')
                sb.append("The "+s+"rd humble number is "+data.get(Integer.parseInt(s)-1)+".\n");
            else
                sb.append("The "+s+"th humble number is "+data.get(Integer.parseInt(s)-1)+".\n");
        }
        System.out.print(sb);
    }
}
