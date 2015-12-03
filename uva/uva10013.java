package uva;
//大數加法
import java.math.BigInteger;
import java.util.*;

public class uva10013 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String str[] = new String[t];
        BigInteger n,m;
        BigInteger p[] = new BigInteger[t];
        System.out.println();
        for(int i=0;i<=t-1;i++)
        {   
            n = m = BigInteger.ZERO;
            str[i] = "";
            int a = scanner.nextInt();
            String str1,str2,str3,str4 ;
            str1 = str2 = str3 = str4 = "";
            for(int j=0;j<=a-1;j++)
            {
                str3 = scanner.next();
                str1 = str1 + str3;
                str4 = scanner.next();
                str2 = str2 + str4;              
            }
                System.out.println();
                n = new BigInteger(str1,10);
                m = new BigInteger(str2,10);
                n = n.add(m);
                p[i] = n;
        }
        for(int i=0;i<=t-1;i++)
        {
            System.out.println(p[i]);
            System.out.println();
        }    
    }
}
