

package uva;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class uva00948 
{
        public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));               
        
        ArrayList<Integer> list = new ArrayList<Integer>();       
        list.add(1);
        list.add(1);
        
        for(int i=0;i<37;i++)
            list.add(list.get(i)+list.get(i+1));
            list.remove(0);
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = b;
            boolean bool = false; 
            String str = "";
            
            for(int j=37;j>=0;j--)
            {
                if(b<list.get(j))
                    str  = str + (bool?0:"");
                else
                {
                    b = b - list.get(j);
                    str = str + "1";
                    bool = true;
                }
            }    
            System.out.println(c+" = "+str+" (fib)");
        }
    }
}
