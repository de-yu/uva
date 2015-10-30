/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00147 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long data[] = new Long[30001];
        int num[] = {10,20,50,100,200,500,1000,2000,5000,10000};

        for(int i=0;i<30001;i++)
            data[i] = 1L;
        for(int i=0;i<10;i++)
        {
            data[num[i]]++;
            for(int j=num[i]+5;j<30001;j+=5)
            {
                data[j] = data[j] + data[j-num[i]];
            }
        }
         StringBuffer sb = new StringBuffer("");
        while(true)
        {
            BigDecimal bd = new BigDecimal(br.readLine());
            int n = bd.multiply(new BigDecimal(100.0)).intValue();
            if(n==0)
                break;
              Formatter fm = new Formatter();
            fm.format("%6.2f%17d%n",bd.doubleValue(),data[n]);
            sb.append(fm.toString());
        }
        System.out.print(sb);
    }
}