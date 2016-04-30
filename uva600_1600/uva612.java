
package uva600_1600;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva612 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       int n = scanner.nextInt();
       
       for(int j=0;j<n;j++)
       {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           StringBuilder sb = new StringBuilder();
           
           DNA dna[] = new DNA[b];
           
           for(int i=0;i<b;i++)
           {
               dna[i] = new DNA(scanner.next());
               dna[i].sortness();
           }
           Arrays.sort(dna);
           
           for(int i=0;i<b;i++)
               sb.append(dna[i].s+"\n");
           
           if(j!=0)
               System.out.println();
           System.out.print(sb);
           
       }
      
    }
}
class DNA implements Comparable<DNA>
{
    String s;
    int sort;
    public DNA(String s)
    {
        this.s = s;
        sort = 0;
    }
    public void sortness()
    {
        char c[] = s.toCharArray();
        int l = s.length();
        
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                
                if(c[i]>c[j])
                    sort++;
            }
        }
    }

    public int compareTo(DNA t) {
        
        if(t.sort > sort)
            return -1;
        if(sort > t.sort)
            return 1;
        return 0;
    }
}
