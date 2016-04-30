
package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11854   
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int arr[] = new int[3];
        while(scanner.hasNextInt())
        {
            for(int i=0;i<3;i++)
                arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            
            if(arr[2]==0)
                break;
            else
            {
                if(dou(arr[2])==(dou(arr[1])+dou(arr[0])))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }
    public static int dou(int a)
    {
        return a*a;
    }
}
