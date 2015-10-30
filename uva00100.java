package uva;

//考拉茲臆測

import java.util.*;
public class uva00100 
{
   public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,d,e = 0,max = 0;
        
        while(scanner.hasNextInt())
        {
            a = scanner.nextInt();
            b = scanner.nextInt();
            int a1 = a,b1 = b;
            max = 0;
            if(a>b) 
            {
                    a = a^b;  //互換
                    b = a^b;
                    a = a^b;
            }
            for(int i=a;i<=b;i++)
            {
                d = 1;
                e = i;
                while(i!=1)
                {
                    if(i%2==0)
                        i = i/2;
                    else
                        i = 3*i+1;
                    d++;
                }
                i = e;
                if(d>max)
                max = d;                   
            }
            System.out.println(a1+" "+b1+" "+max);
        }     
    }    
}
