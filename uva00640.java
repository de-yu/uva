import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;
public class uva00640 
{
    public static void main(String[] args)throws IOException
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        boolean b[] = new boolean[1000001];
        bored f = new bored();
        for(int i=1;i<=1000000;i++)
        {
            int a = f.find(Integer.toString(i));
            if(a>1000000)
                continue;
            else
                b[a] = true;
        }
        for(int i=1;i<1000001;i++)
        {
            if(b[i]==false)
                System.out.println(i);
        }    
    }    
}
class bored
{
    public int find(String str)
    {
        int sum = Integer.parseInt(str);
        for(int i=0;i<str.length();i++)
            sum = sum + (int)str.charAt(i)-48;
        return sum;    
    }        
}

