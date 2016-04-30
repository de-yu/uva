/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva10000_10599;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10152 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = Integer.parseInt(br.readLine());
        
        while(n-->0)
        {
            int a = Integer.parseInt(br.readLine());
            String now[] = new String[a];
            String change[] = new String[a];
            String answer[] = new String[a];
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0;i<a;i++)
                answer[i] = "";
            
            for(int i=0;i<a;i++)
                now[i] = br.readLine();
            
            for(int i=0;i<a;i++)
                change[i] = br.readLine();
            
            int c = a-1,d = a-1;
            
            while(c>=0)
            {
                if(now[c].equals(change[d]))
                {
                    c--;
                    d--;
                }
                else
                {
                    for(int i=0;i<a;i++)
                    {
                        if(now[c].equals(change[i]))
                        {
                            answer[i] = now[c];
                            c--;
                            break;
                        }
                    }
                }
            }
            
            for(int i=0;i<a;i++)
            {
                if(answer[i].equals(""))
                    break;
                sb.insert(0, answer[i]+"\n");
            }
            System.out.println(sb);
        }
    } 
}
