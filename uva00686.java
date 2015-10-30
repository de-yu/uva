
package uva3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00686 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();
        int data[] = new int[32768];
        for(int i=2;i<=32768;i++)
        {
            BigInteger a = new BigInteger(Integer.toString(i));
            if(a.isProbablePrime(2)&&a.isProbablePrime(7))
            {
                num.add(i);
                data[i] = 1;
            }
        }
        while(scanner.hasNextInt())
        {
            int b = scanner.nextInt();
            if(b==0)
                break;
            int sum = 0;
            for(int h:num)
            {
                if(h*2>b)
                    break;
                if(data[b-h]==1)
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
