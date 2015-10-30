

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00138 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int count = 0;
	        for(long k=2;count<10;k++){
	            long sum = (k*k+k)>>1;
	            double n = Math.sqrt(sum);
	            if(n == (int)n){
	                System.out.printf("%10d%10d\n", (int)n,k);
	                count++;
	            }
	        }
    }
}


