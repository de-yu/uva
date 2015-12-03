package uva;

// 兩個數相加計算計為幾次
import java.util.*;
import java.lang.*;
public class uva10035 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);        
        String a,b,c;
        int d,e,f,g;   
        while(scanner.hasNextInt())
        {   
            d = 0;
            a = scanner.next();
            b = scanner.next();
            if(a.equals("0")&&b.equals("0"))
            break;    
            if(a.length()>b.length())
            {   
                c = "";
                f = a.length()-b.length();
                for(int i=1;i<=f;i++)
                c = c + "0";
                b = c + b;
            }    
            else if(b.length()>a.length())
            {
                c = "";
                f = b.length()-a.length();
                for(int i=1;i<=f;i++)
                c = c + "0";
                a = c + a;
            }
            g = 0;
            for(int i=a.length()-1;i>=0;i--)
            {
                if(Integer.parseInt(Character.toString(a.charAt(i)))+Integer.parseInt(Character.toString(b.charAt(i)))+g>=10)
                {
                    d++;
                    g = 1;                
                }
                else
                g = 0;    
            }                
            if(d==0)
            System.out.println("No carry operation.");
            else if(d==1)
            System.out.println("1 carry operation.");
            else
            System.out.println(d+" carry operations.");    
        }    
    }        
}
