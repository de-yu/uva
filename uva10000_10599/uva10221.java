

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10221 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(scanner.hasNextLine())
        {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            double a = Double.parseDouble(st.nextToken()) + 6440;
            double b = Double.parseDouble(st.nextToken());
            String s = st.nextToken();
            if(s.equals("min"))
                b = b/60;
            if(b>180)
                b = 360-b;
            double c = a*2*Math.PI*b/360;
            double d = a*Math.sin(b/2/(180/Math.PI))*2;
            
            System.out.printf("%.6f %.6f%n",c,d);
        }
    }
}
