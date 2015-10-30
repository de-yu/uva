

package uva5;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10497 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        BigInteger data[] = new BigInteger[801];
        data[0] = data[1] = BigInteger.ZERO;
        data[2] = BigInteger.valueOf(1);

        for(int i=3;i<801;i++)
            data[i] = BigInteger.valueOf(i-1).multiply(data[i-1].add(data[i-2]));
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a<0)
                break;
            System.out.println(data[a]);
        }
    }
}
