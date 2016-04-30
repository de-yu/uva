/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva11000_11599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva11559 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        while(scanner.hasNextInt())
        {
            int data[] = new int[4];
            for(int i=0;i<4;i++)
                data[i] = scanner.nextInt();
            
            int money[] = new int[data[3]];
            int min = 500001;
            for(int i=0;i<data[3];i++)
                money[i] = 500001;
            
            for(int i=0;i<data[2];i++)
            {
                int price = scanner.nextInt();
                for(int j=0;j<data[3];j++)
                {
                    int people = scanner.nextInt();
                    if(people>=data[0])
                        money[j] = Math.min(price*data[0],money[j]);
                }
            }
            for(int i=0;i<data[3];i++)
                min = Math.min(min, money[i]);
            if(min<data[1])
                System.out.println(min);
            else
                System.out.println("stay home");
        }
    }
}
