import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10127 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int n = 0;
           int one = 1;
           for(;;)
           {
               one = one % a;
               n++;
               if(one==0)
                   break;
               else
                   one = one *10 + 1;               
           }
           System.out.println(n);
       }    
    }
}
