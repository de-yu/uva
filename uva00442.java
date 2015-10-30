

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00442
{ 
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int a = scanner.nextInt();
        HashMap<Character, matrix> map = new HashMap<Character , matrix>();
        char data[] = new char[a];
        while(a-->0)
        {
            String b = scanner.next();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            map.put(b.charAt(0), new matrix(c,d));
            data[a] = b.charAt(0);
        }
        while(scanner.hasNext())
        {
            String str = scanner.next();
            int sum = 0;
            boolean boo = false;
            
            HashMap<Character, matrix> change = new HashMap<Character , matrix>();
            mapclone(map ,change,data);
            
            if(str.length()==1)
                System.out.println("0");
            else
            {
                Stack<Character> stack = new Stack<Character>();
                Stack<Character> cal = new Stack<Character>();
                int l = str.length();
                
                start:
                for(int i=0;i<l;i++)
                { 
                    if(str.charAt(i)!=')')
                        stack.add(str.charAt(i));
                    else
                    {
                        char cc = stack.pop();
                        while(cc!='('){
                            cal.add(cc);
                            cc = stack.pop();            
                        }
                        
                        char first = cal.peek();
                        int w = 0,h = 0;
                        
                        while(cal.size()!=1)
                        {
                            matrix m = change.get(cal.pop());
                            matrix n = change.get(cal.pop());
                            
                            if(m.c!=n.b)
                            {
                                boo = true;
                                break start;
                            }
                            sum = sum + m.multiple(n);
                            w = m.b;
                            h = n.c;
                            cal.add(first);
                            change.put(first,new matrix(w,h));                        
                        }
                        stack.add(cal.pop());
                    }
                }
                if(boo)
                    System.out.println("error");
                else
                    System.out.println(sum);     
            }    
            
        }
    }
    public static void mapclone(HashMap<Character, matrix> map,HashMap<Character, matrix> change,char data[])
    {
        for(char c:data)
        {
            change.put(c, map.get(c));
        }
    }
}
class matrix
{
    int b;
    int c;
    public matrix(int d,int e)
    {
        b = d;
        c = e;
    }
    public int multiple(matrix m)
    {
        //System.out.println(b+" "+c+" "+m.b+" "+m.c);
        return b*c*(m.c);
    }
}

