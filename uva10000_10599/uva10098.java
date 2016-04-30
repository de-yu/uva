
package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva10098 
{
    public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int n = scanner.nextInt();
        String str ;        
        for(int i=0;i<n;i++)
        {
            ArrayList<String> cc = new ArrayList<String>();
            str = scanner.next();
            for(int j=0;j<str.length();j++)
                cc.add(Character.toString(str.charAt(j)));
            Collections.sort(cc);
            backtracking b = new backtracking();
            b.answer(cc,str.length(),0);
            b.out();
        }
    }
}
class backtracking
{        
    
    String str = "";
    boolean bool[] = new boolean[10];
    StringBuffer sb = new StringBuffer("");
    public void answer(ArrayList<String> c,int a,int b)            
    {
        if(a==b)
        {
            sb.append(str+"\n");
            return;
        }      
        String last = "";
        for(int i=0;i<a;i++)
        {
            if(!bool[i])
            {
                if(!c.get(i).equals(last))
                {    
                    str = str + c.get(i);
                    bool[i] = true;
                    last = c.get(i);
                    answer(c,a,b+1);
                    str = (str.length()==1?"":str.substring(0,str.length()-1));
                    bool[i] = false;
                }
            }    
        }    
    }
    public void out()
    {
        System.out.println(sb);
    }
}