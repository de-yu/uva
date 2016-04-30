

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva441 
{
  public static void main(String[] args)
    {   
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = 0;
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            if(a==0)
                break;
            int b[] = new int[a];
            for(int i=0;i<a;i++)
                b[i] = scanner.nextInt();
            backtrack bt = new backtrack();
            if(n!=0)
              System.out.println();
            bt.answer(b,a,0,0);
            n++;
        }    
    }        
}
class backtrack
{
    int bb[] = new int[6];
    boolean bool[] = new boolean[13];
    public void answer(int c[],int a,int b,int e)
    {
        if(b==6)
        {
            for(int i=0;i<6;i++)
            {
                if(i<5)
                System.out.print(bb[i]+" ");
                else
                    System.out.print(bb[i]);
            }
            System.out.println();
            return;
        }
        for(int i=e;i<a;i++)
        {
            if(!bool[i])                
            {
                bool[i] = true;
                bb[b] = c[i];
                answer(c,a,b+1,i+1);
                bool[i] =false;
            }
        }    
    }
}