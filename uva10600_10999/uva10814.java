package uva10600_10999;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class uva10814
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		for(int i=0;i<a;i++)
		{
			BigInteger b = scanner.nextBigInteger();
			String c = scanner.next();
			BigInteger d = scanner.nextBigInteger();
			BigInteger e = b.gcd(d);
			
			System.out.println(b.divide(e)+" / "+d.divide(e));
			
		}
	}
}
