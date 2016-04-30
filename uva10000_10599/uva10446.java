

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10446 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger data[][] = new BigInteger[65][65];
        for(int i=0;i<65;i++)
            for(int j=0;j<65;j++)
                data[i][j] = BigInteger.ZERO;
         dp d = new dp();
        for(int i=0;i<65;i++)
        {
            for(int j=0;j<65;j++)
            {
               d.count = BigInteger.ZERO;
               data[i][j] = d.trib(data,i,j);;
            }
        }
        int n =1;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case "+n+": "+data[a][b]);
            n++;
        }
    }
}
class dp
{
    BigInteger count = BigInteger.ZERO;
    public BigInteger trib(BigInteger data[][],int a,int b)
    {
        count = count.add(BigInteger.ONE);
        if(a<=1)
            return BigInteger.ONE;
        if(!(data[a][b].equals(BigInteger.ZERO)))
        {
            return data[a][b];
        }
        for(int i=1;i<=b;i++)
             count = count.add(trib(data,a-i,b));
        return count;
    }
}