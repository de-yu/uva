/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva12577   
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = 1;
        while(scanner.hasNext())
        {
            String s = scanner.next();
            if(s.equals("*"))
                break;
            System.out.print("Case "+n+": ");
            if(s.equals("Hajj"))
                System.out.println("Hajj-e-Akbar");
            else
                System.out.println("Hajj-e-Asghar");
            n++;
        }
    }
}
