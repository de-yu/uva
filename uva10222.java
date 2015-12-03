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
public class uva10222 
{
      public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String l1[] = {"`","1","2","3","4","5","6","7","8","9","0","-","="};
        String l2[] = {"q","w","e","r","t","y","u","i","o","p","[","]","\\"};
        String l3[] = {"a","s","d","f","g","h","j","k","l",";","'"};
        String l4[] = {"z","x","c","v","b","n","m",",",".","/"};
        
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            str = str.toLowerCase();
            String ans = "";
            for(int i=0;i<str.length();i++)
            {
                for(int j=0;j<l1.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l1[j]))
                    ans = ans + l1[j-2];                       
                }
                for(int j=0;j<l2.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l2[j]))
                    ans = ans + l2[j-2];   
                }
                for(int j=0;j<l3.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l3[j]))
                    ans = ans + l3[j-2];   
                }
                for(int j=0;j<l4.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l4[j]))
                    ans = ans + l4[j-2]; 
                }
                if(Character.toString(str.charAt(i)).equals(" "))
                    ans = ans + " ";
            }
            System.out.println(ans);
        }        
    } 
}
