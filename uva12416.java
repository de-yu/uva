import java.io.*;
import java.util.*;
public class uva12416 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       
       while(scanner.hasNextLine())
       {
           String str = scanner.nextLine();
           int n = 0,max = 0;
           for(int i=0;i<str.length();i++)
           {
               if((int)str.charAt(i)==32)
               {
                   n++;
                   max = (n>max?n:max);
               }
               else                
                   n = 0;                  
           }
           n = 0;
           while(max>1){
               n++;
               max = max/2 + max%2;
           }
                System.out.println(n);
       }    
    } 
}
