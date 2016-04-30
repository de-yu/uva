
package uva600_1600;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva619 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(str.equals("*"))
                break;
            if((int)str.charAt(0)<97)
                num(str);
            else
                abcd(str);
            
        }
    }
    public static BigInteger div = new BigInteger("26");
    public static BigInteger zero = BigInteger.ZERO;
    public static void num(String str)
    {
        BigInteger a = new BigInteger(str);
        StringBuffer sb = new StringBuffer("");
        StringBuffer n = new StringBuffer("");
        while(!(a.divide(div).equals(zero)))
        {
            sb.insert(0,(char)(a.mod(div).intValue()+96));
            a = a.divide(div);
        }
        sb.insert(0,(char)(a.intValue()+96));
        for(int i=0;i<str.length();i++)
        {
            if(i%3==0&&i!=0)
                n.insert(0,",");
            n.insert(0, str.charAt(str.length()-i-1));
        }
        while(sb.length()<22)
            sb.append(" ");
        System.out.println(sb+""+n);
    }
    public static void abcd(String str)
    {
        BigInteger sum = BigInteger.ZERO;
        StringBuffer n = new StringBuffer("");
        for(int i=0;i<str.length();i++)
        {
            BigInteger ab = BigInteger.valueOf(((int)str.charAt(i))-96);
            sum = sum.add(div.pow(str.length()-i-1).multiply(ab));
        }
        String s = sum.toString();
        for(int i=0;i<s.length();i++)
        {
            if(i%3==0&&i!=0)
                n.insert(0,",");
            n.insert(0, s.charAt(s.length()-i-1));
        }
        while(str.length()<22)
            str = str + " ";
        System.out.println(str+""+n);
    }
}
