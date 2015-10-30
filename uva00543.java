import java.io.*;
import java.util.*;
public class uva00543 
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
       boolean num[] = new boolean[1000000];
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i=3;i<1000000;i++)
       {
           if(i%2==0)
               num[i] = true;
           if(!num[i])
           {
               for(int j=i+i;j<1000000;j+=i)
                    num[j] = true;                    
           }    
       }
       for(int i=2;i<1000000;i++)
       {
           if(!num[i])
               list.add(i);
       }    
       while(scanner.hasNextInt())
       {
           int a = scanner.nextInt();
           if(a==0)
               break;
           for(int i=0;i<list.size();i++)
           {
               if(!num[a-list.get(i)])
               {
                   System.out.println(a+" = "+list.get(i)+" + "+ (a-list.get(i)));
                   break;
               }                                      
           }               
       }
    }
}
