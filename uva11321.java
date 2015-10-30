
package uva3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva11321 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           if(a==0&&b==0)
               break;
           ArrayList<Integer> data[] = new ArrayList[b*2-1];
           for(int i=0;i<b*2-1;i++)
               data[i] = new ArrayList<Integer>();
           
           for(int i=0;i<a;i++)
           {
               int c = scanner.nextInt();
               data[c%b+b-1].add(c);
           }
           System.out.println(a+" "+b);
           for(int i=0;i<b*2-1;i++)
           {
               StringBuffer one = new StringBuffer("");
               StringBuffer two = new StringBuffer("");
               Collections.sort(data[i]);
               for(int h:data[i])
               {
                   if(h%2==1||h%2==-1)
                       one.insert(0,h+"\n");
                   else
                       two.append(h+"\n");
               }
                System.out.print(one+""+two);
           }
       }
       System.out.println("0 0");
    }
}
