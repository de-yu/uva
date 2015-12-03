package uva;
//加密法
import java.util.*;

public class uva10019 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b[] = new String[a];
        String c[] = new String[a];
        String d[] = new String[a];
        Vector v = new Vector();
        int e,f=0;
        for(int i=0;i<=a-1;i++)
        {
            b[i] = scanner.next();
            c[i] = Integer.toBinaryString(Integer.valueOf(b[i],10));
            d[i] = Integer.toBinaryString(Integer.valueOf(b[i], 16));
        }
        for(int i=0;i<=a-1;i++)
        {  
           e = 0;
           for(int j=0;j<=c[i].length()-1;j++)
           {
               if(c[i].charAt(j)=='1')
                e++;   
           }
           v.add(f,e);
           f++;
           e = 0;
           for(int j=0;j<=d[i].length()-1;j++)
            {
                if(d[i].charAt(j)=='1')
                    e++;
            }
            v.add(f,e);
            f++;
        }  
        for(int i=0;i<=a*2-1;i++)
        {  
           if(i%2==1)
           {
               System.out.println(" "+v.get(i));
               continue;
           }    
           System.out.print(v.get(i));           
        }    
        
    }        
}
