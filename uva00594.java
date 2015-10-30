

package uva;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva00594 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.println(a+" converts to "+Integer.reverseBytes(a));
        }
       
        
    }
}
