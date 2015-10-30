
package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva00537 
{
  public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            electric e[] = new electric[2];
            int es = 0;
            while(st.hasMoreTokens())
            {
                String s = st.nextToken();
                if(check(s))
                {
                    Pattern p = Pattern.compile("[PUI]");
                    Matcher m = p.matcher(s);
                    while(m.find())
                    {
                        e[es] = new electric(m.group());
                    }
                     p = Pattern.compile("[\\d.]*");
                     m = p.matcher(s);
                     while(m.find())
                     {
                         if(!m.group().equals(""))
                            if((int)m.group().charAt(0)>=48&&(int)m.group().charAt(0)<=57)
                                 e[es].a = Double.parseDouble(m.group());
                     }
                      p = Pattern.compile("[mkM]");
                     m = p.matcher(s);
                     while(m.find())
                     {
                         if(m.group().equals("m"))
                             e[es].a = e[es].a/1000;   
                         else if(m.group().equals("k"))
                             e[es].a = e[es].a*1000;   
                         else
                             e[es].a = e[es].a*1000000;   
                     }
                    es++;
                }
            }
            if(e[0].b=='P')
            {
                if(e[1].b=='U')
                    System.out.printf("Problem #%d%nI=%.2fA%n%n",i,e[0].a/e[1].a);
                else
                    System.out.printf("Problem #%d%nU=%.2fV%n%n",i,e[0].a/e[1].a);
            }
            else if(e[1].b=='P')
            {
                if(e[0].b=='U')
                    System.out.printf("Problem #%d%nI=%.2fA%n%n",i,e[1].a/e[0].a);
                else
                    System.out.printf("Problem #%d%nU=%.2fV%n%n",i,e[1].a/e[0].a);
            }
            else
            System.out.printf("Problem #%d%nP=%.2fW%n%n",i,e[0].a*e[1].a);
        }
    }
    public static boolean check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='=')
                return true;
        }
        return false;
    }
}
class electric
{
    double a = 0;
    char b;
    public electric(String d)
    {
        b = d.charAt(0);
        a = 0;
    }
}
