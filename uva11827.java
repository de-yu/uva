/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11827 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++)
        {
            String str = scanner.nextLine();
            String data[] = str.split(" ");
            int max = 1;
            for(int j=0;j<data.length;j++)
            {
                if(data[j].length()==0||data[j].equals(" "))
                    continue;
                BigInteger b = new BigInteger(data[j]);

                for(int k=j+1;k<data.length;k++)
                {
                    if(data[k].length()==0||data[k].equals(" "))
                    continue;
                        BigInteger c = new BigInteger(data[k]);   
                    

                    if(b.gcd(c).intValue()>max)
                        max = b.gcd(c).intValue();
                }    
            }
            System.out.println(max);
        }
    }
}
