
package uva;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Math.*;
import java.util.regex.*;
public class uva01583 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int data[] = new int[100001];
        Arrays.fill(data, 1000000);
        
        for(int i=1;i<100001;i++)
        {
            int sum = i + digitsum(Integer.toString(i));
            if(sum>100000)
                continue;
            data[sum] = Math.min(data[sum] , i);
        }
       
        int n = scanner.nextInt();
        while(n-->0)
        {
            int a = scanner.nextInt();
            if(data[a]==1000000)
                System.out.println("0");
            else
            System.out.println(data[a]);
        }
    }
    public static int digitsum(String str)
    {
        int l = str.length();
        int sum = 0;
        for(int i=0;i<l;i++)
            sum = sum + str.charAt(i)-48;
        return sum;
    }
}
