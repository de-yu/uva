
package uva;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva10139 
{
    public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num[] = new int[46342];
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int size = 0;
        for(int i=2;i<46342;i++)
        {
            if(num[i]==0)
            {
                prime.add(i);
                for(int j=i*i;j<46342;j+=i)
                    num[j] = 1;
            }
        }
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt()
                ,b = scanner.nextInt()
                ,divide = b;
            boolean answer = true;         
            
            for(int i : prime)
            {
                int factor = 0 , sum = 0;
                while(divide%i==0)
                {
                    divide /= i;
                    factor++;
                }
                if(factor==0)
                    continue;
                sum = sum(a , i);
                if(factor>sum)
                {
                    answer = false;
                    break;
                }
            }
            if(answer)
            {
                if(a<divide && divide>1)
                    answer = false;
            }
            if(answer)
                System.out.println(b+" divides "+a+"!");
            else
                System.out.println(b+" does not divide "+a+"!");
        }
    }
    public static int sum(int a , int p)
    {
        int s = 0;
        while(a>=p)
        {  
            a /= p;
            s += a;
        }
        return s;
    }
}
