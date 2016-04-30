

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10409 
{
   public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n;
        
        while((n = scanner.nextInt())!=0)
        {
            String str;
            int up = 1,north = 2,
                  west = 3, east = 4,
                    south = 5,down = 6;
            
            for(int i=0;i<n;i++)
            {
                str = scanner.next();
                if(str.charAt(0)=='s')
                {
                    down = south;
                    south = up;
                    up = north;
                    north = 7 - south;
                }
                else if(str.charAt(0)=='e')
                {
                    down = east;
                    east = up;
                    up = west;
                    west = 7 - east;
                }
                else if(str.charAt(0)=='w')
                {
                    down = west;
                    west = up;
                    up = east;
                    east = 7-west;
                }
                else
                {
                    down = north;
                    north = up;
                    up = south;
                    south = 7-north;
                }
            }
            
            System.out.println(up);
        }
    }         
}
