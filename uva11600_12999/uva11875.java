

package uva11600_12999;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11875 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = scanner.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int a = scanner.nextInt();
            int data[] = new int[a];
            
            for(int j=0;j<a;j++)
                data[j] = scanner.nextInt();
            
            Arrays.sort(data);
            
            System.out.println("Case "+i+": "+data[a/2]);
        }
    }
}
