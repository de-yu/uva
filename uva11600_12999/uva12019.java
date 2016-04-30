
package uva11600_12999;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva12019 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String date[] = {"Sunday","Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int a = scanner.nextInt();
        while(scanner.hasNextInt())
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int y = 11;
            if(b==1)
            {
                b = 13;
                y--;
            }
            if(b==2)
            {
                b = 14;
                y--;
            }
            int w = (y + 2 + 5 - 40 + 26*(b+1)/10 + c - 1)%7;
            if(w<0)
                System.out.println(date[w+7]);
            else
                System.out.println(date[w]);
        }
    }
}
