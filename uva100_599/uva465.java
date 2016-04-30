package uva100_599;

import java.math.BigInteger;
import java.util.Scanner;
	 
	 
public class uva465
 {
	 
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        BigInteger max = new BigInteger(Integer.MAX_VALUE+"");
	         
	        while(in.hasNext()){
	            String str = in.nextLine();
	            StringBuilder sb = new StringBuilder(str+"\n");
	            String[] sarr = str.split(" ");
	             
	            BigInteger bi1 = new BigInteger(sarr[0]);
	            BigInteger bi2 = new BigInteger(sarr[2]);
	            BigInteger sum ;
	                if(sarr[1].equals("+")){
	                    sum = bi1.add(new BigInteger(sarr[2]));
	                }else {
                    sum = bi1.multiply(new BigInteger(sarr[2]));
	                }
	                 
	                if(bi1.compareTo(max)==1){
	                    sb.append("first number too big\n");
	                }
	                                 if(bi2.compareTo(max)==1){
	                    sb.append("second number too big\n");
                }
	                 
                if(sum.compareTo(max)==1){
	                    sb.append("result too big\n");
	                }
	                System.out.print(sb);
	            }
	    }
	}
