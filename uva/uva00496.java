/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uva5;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00496 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
     while(scanner.hasNextLine())
     {
         String a = scanner.nextLine();
         String b = scanner.nextLine();
         
         if(a.equals("")&&b.equals(""))
         {
             System.out.println("A equals B");
             continue;
         }
         else if(a.equals("")||b.equals(""))
         {
             if(a.equals(""))
             System.out.println("A is a proper subset of B");
             else
                 System.out.println("B is a proper subset of A");
             continue;
         }
             
         String adata[] = a.split(" ");
         String bdata[] = b.split(" ");
         HashSet<String> aset = new HashSet<String>();
         HashSet<String> bset = new HashSet<String>();
         numToSet(aset,adata);
         numToSet(bset,bdata);
         
         int sum = 0;
         
         for(String s:aset)
         {
             for(String ss:bset)
             {
                 if(s.equals(ss))
                     sum++;
             }
         }
         
         if(sum==aset.size()&&sum==bset.size())
             System.out.println("A equals B");
         else if((sum==aset.size()||sum==bset.size())&&aset.size()!=bset.size())
         {
             if(aset.size()>bset.size())
                 System.out.println("B is a proper subset of A");
             else
                  System.out.println("A is a proper subset of B");
         }
         else if(sum==0)
             System.out.println("A and B are disjoint");
         else
             System.out.println("I'm confused!");
         
     }
    }
    public static void numToSet( HashSet<String> set,String data[])
    {
        for(int i=0;i<data.length;i++)
            set.add(data[i]);
    }
}
