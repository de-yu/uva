package uva;

import java.util.*;

public class uva10050 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        for(int i=0;i<a;i++)
        {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int bother[] = new int[c+1];
            int num = 0;
            for(int j=1;j<=c;j++)
                bother[j] = scanner.nextInt();
            for(int j=1;j<=b;j++)
            {
                if((j-6)%7==0||j%7==0)
                    continue;
                for(int k=1;k<=c;k++)
                {
                    if(j%bother[k]==0)
                    {
                        num++;
                        break;
                    }
                }
            }
            System.out.println(num);
        }    
        
    }        
}
