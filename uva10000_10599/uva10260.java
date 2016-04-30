
package uva10000_10599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10260 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('B',1);
        map.put('F',1);
        map.put('P',1);
        map.put('V',1);
        map.put('C',2);
        map.put('G',2);
        map.put('J',2);
        map.put('K',2);
        map.put('Q',2);
        map.put('S',2);
        map.put('X',2);
        map.put('Z',2);
        map.put('D',3);
        map.put('T',3);
        map.put('L',4);
        map.put('M',5);
        map.put('N',5);
        map.put('R',6);
        
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer("");
            int before = 9;
            
            for(int i=0;i<s.length();i++)
            {
                if(map.get(s.charAt(i))==null)
                {
                    before = 9;
                    continue;
                }
                if(map.get(s.charAt(i))!=before)
                {
                    sb.append(map.get(s.charAt(i)));
                    before = map.get(s.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
