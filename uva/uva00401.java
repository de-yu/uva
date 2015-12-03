

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva00401 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        char alpha[] = {' ', '1' , 'S' , 'E' , ' ' , 'Z' , ' ' , ' ' , '8' , ' ' 
               ,' ',' ',' ',' ',' ',' ',' '
               ,'A' , ' ' ,' ' , ' ' , '3' , ' ' , ' ' , 'H' , 'I' , 'L' , ' ' , 'J' , 'M' , ' ' , 'O' , ' ' , ' ' , ' ' , '2' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , '5'};

        while(scanner.hasNext())
        {
            String a = scanner.next();
            int l = a.length();
            int level = 3;
            
            for(int i=0;i<(l+1)/2;i++)
            {
                int b = 3;
                int c = a.charAt(i);
                int d = a.charAt(l-i-1);
                
                if(c==d)
                {
                    if(alpha[c-48]!=(char)c)
                        b = 1;
                }
                else
                {
                    if(alpha[c-48]==(char)d)
                        b = 2;
                    else
                        b = 0;
                }
                level = Math.min(level, b);
            }
            
            if(level==3)
                System.out.printf("%s -- is a mirrored palindrome.%n%n",a);
            else if(level==2)
                System.out.printf("%s -- is a mirrored string.%n%n",a);
            else if(level==1)
                System.out.printf("%s -- is a regular palindrome.%n%n",a);
            else
                System.out.printf("%s -- is not a palindrome.%n%n",a);
        }
        
    }
}
