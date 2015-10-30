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
public class uva00291 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
             
        ArrayList<Integer> data[] = new ArrayList[6];  
        for(int i=0;i<6;i++)
            data[i] = new ArrayList<Integer>();
        
        data[1].add(2);
        data[1].add(3);
        data[1].add(5);
        data[2].add(1);
        data[2].add(3);
        data[2].add(5);
        data[3].add(1);
        data[3].add(2);
        data[3].add(4);
        data[3].add(5);
        data[4].add(3);
        data[4].add(5);
        data[5].add(1);
        data[5].add(2);
        data[5].add(3);
        data[5].add(4);
        
        DFS(data,1,1,"");
     }
    static boolean road[][] = new boolean[6][6]; 
    public static void DFS(ArrayList<Integer> data[],int n,int num,String str)
    {
        if(n==9)
        {
            System.out.println(1+str);
            return;
        }    
        for(int i=0;i<data[num].size();i++)
        {
            if(!road[data[num].get(i)][num])
            {
                road[data[num].get(i)][num] = true;
                road[num][data[num].get(i)] = true;
                DFS(data,n+1,data[num].get(i),str+ data[num].get(i));
                 road[data[num].get(i)][num] = false;
                  road[num][data[num].get(i)] = false;
            }
        }
    }
}
