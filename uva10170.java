package uva;

import java.util.*;


public class uva10170 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Double a,b,c,d;
        while(scanner.hasNextLine())
        {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());
            if(a>b)
            {
            	d = a;
            	b = a;
            	a = d;
            }
           c = Math.sqrt((a*a - a + 2*b)*4+1)-1;
           c = Math.ceil(c/2);
           
           System.out.println((int)(c/1));
        }
    }        
}
