

package uva100_599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva484 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<Integer> set = new LinkedHashSet<Integer>();
        while(scanner.hasNextInt())
        {

                int b = scanner.nextInt();
                if(map.get(b)==null)
                {
                    map.put(b,1);
                    set.add(b);
                }
                else
                {
                    int c = map.get(b);
                    map.put(b,c+1);
                }
            
        }
        StringBuilder sb = new StringBuilder("");
            for(int i:set)
            {
                sb.append(i+" "+map.get(i)+"\n");
            }
            System.out.print(sb);
    } 
}
