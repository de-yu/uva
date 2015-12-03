

package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva11777 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        int data[] = new int[3];
        for(int i=1;i<=n;i++)
        {
            int sum = 0;
            for(int j=0;j<4;j++)
                sum +=scanner.nextInt();
            for(int j=0;j<3;j++)
                data[j] = scanner.nextInt();
            Arrays.sort(data);
               sum += (data[2]+ data[1])/2;
               System.out.printf("Case %d: ",i);
            if(sum>=90)
                System.out.println("A");
            else if(sum>=80)
                System.out.println("B");
             else if(sum>=70)
                System.out.println("C");
             else if(sum>=60)
                System.out.println("D");
            else
                 System.out.println("F");
               
            
        }    
            
    }
}
