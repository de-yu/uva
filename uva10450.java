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
import java.util.regex.*;
public class uva10450 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        long data[] = new long[52];
        data[0] = 0L;
        data[1] = 2L;
        data[2] = 3L;
        for(int i=3;i<52;i++)
            data[i] = data[i-1] + data[i-2];
        
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a = scanner.nextInt();
            System.out.println("Scenario #"+i+":\n"+data[a]+"\n");
        }
    }
}
