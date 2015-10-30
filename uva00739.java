package uva2;
import java.io.*;
import java.util.*;
public class uva00739 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
            String data[] = new String[7];
        data[0] = "AEIOUYWH";
        data[1] = "BPFV";
        data[2] = "CSKGJQXZ";
        data[3] = "DT";
        data[4] = "L";
        data[5] = "MN";
        data[6] = "R";
        StringBuffer sb = new StringBuffer("         NAME                     SOUNDEX CODE\n");
        String ans,str,n = "";
        int a;
        inspect in = new inspect();
        while(scanner.hasNext())
        {
            str = scanner.next();
            n = n + Character.toString(str.charAt(0));
            
            for(int i=1;i<str.length();i++)
            {
                n = n + in.num(i-1,i, str,data);
                if(n.length()==4)
                    break;
            }
            while(n.length()!=4)
                n = n + "0";
            ans = "         " + str; 
            while(ans.length()!=34)
                ans = ans + " ";
            ans = ans + n;
            sb.append(ans+"\n");
            ans = n = "";
        }
        System.out.println(sb+"                   END OF OUTPUT");
        
    }        
}
class inspect
{
    public String num(int a,int b,String str,String data[])
    {
        int c = 0,d = 0;      
        for(int i=0;i<7;i++)
        {
            if(data[i].contains(Character.toString(str.charAt(a))))
                c = i;
            if(data[i].contains(Character.toString(str.charAt(b))))
                d = i;
        }
        if(c==d)
            return "";
        else if(d==0)
            return "";
        else
            return Integer.toString(d);
    }
}
