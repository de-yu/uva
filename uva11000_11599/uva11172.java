
package uva11000_11599;

import java.util.*;
import java.lang.*;
import java.io.*;

public class uva11172 
{
    public static void main (String[] args)throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		int c = scanner.nextInt();
		for(int i=0;i<c;i++)
		{
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			if(a>b)
				System.out.println(">");
			else if(b>a)
				System.out.println("<");
			else if(a==b)
				System.out.println("=");
		}
	}
}
