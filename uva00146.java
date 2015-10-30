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
public class uva00146 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(str.equals("#"))
                break;
            String data1[] = new String[str.length()];
            String data2[] = new String[str.length()];
            turn_array(data1,str);
            turn_array(data2,str);
            int num[] = new int[str.length()];
 
            Arrays.sort(data1);
            
            for(int i=0;i<str.length();i++)
            {
                for(int j=0;j<str.length();j++)
                {
                    if(data1[j].equals(data2[i]))
                    {
                        num[i] = j;
                        data1[j] = "0";
                        break;
                    }
                }
            }
            turn_array(data1,str);
            Arrays.sort(data1);
            back b = new back();
            b.nonMultiplePermutations(data1,"", 0,num);
        }
    }   
    public static void turn_array(String str[],String s)
    {
        for(int i=0;i<s.length();i++)
             str[i] = Character.toString(s.charAt(i));
    }
}
class back
{
    boolean use[] = new boolean[55];
    int a = 0;
    int b = 0;
    boolean boo = true;
    public void nonMultiplePermutations(String data[],String answer,int n,int num[])//data need (Arranged according to size) answer = ""
    {
        if(n==data.length)
        {
            if(a==1)
            {
                System.out.println(answer);
                boo = false;
            }
            b = 1;
            a++;
            return;
        }
        String last_str = "";
        int c = (b==0?num[n]:0);
        for(int i=c;i<data.length;i++)
        {
            if(!use[i])
            {
                if(!data[i].equals(last_str))
                {
                    last_str = data[i];
                    use[i] = true;
                    nonMultiplePermutations(data,answer+data[i],n+1,num);
                    use[i] = false;
                }
            }
            if(a>=2)
                break;
        }
        if(n==0&&boo==true)
        {
            System.out.println("No Successor");
        }
    }
}
