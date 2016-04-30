package uva10600_10999;
//計算多少到多少的奇數數量
import java.util.*;

public class uva10783 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        a = scanner.nextInt();
        int e[] = new int[a];
        
        for(int i=0;i<=a-1;i++)
        {
            d = 0;
            b = scanner.nextInt();
            c = scanner.nextInt();
            for(int j=b;j<=c;j++)
            {
                if(j%2!=0)
                d = d+j;    
            }
            e[i] = d;
        }    
        for(int i=0;i<=a-1;i++)
        {
            System.out.println("Case "+(i+1)+": "+e[i]);
        }    
    }        
}
