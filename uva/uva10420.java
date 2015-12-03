package uva;
//輸入國家名和人名 哪個國家有幾個人
import java.util.*;

public class uva10420 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        
        int coun[] = new int[n];
        String s;
        String country[] = new String[n]; 
        String name[] = new String[n];
        for(int i=0;i<=n-1;i++)
        {
            country[i] = scanner.next();
            name[i] = scanner.nextLine();
        }
        for(int i=0;i<=n-2;i++)           
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(country[i].compareTo(country[j])>0)
                {
                    s = country[j];
                    country[j] = country[i];
                    country[i] = s;
                }    
            }                
        }                    
        for(int i=0;i<=n-1;i++)
        {   
            coun[i] = 0;
            for(int j=i;j<=n-1;j++)
            {    
                if(country[i].contains(country[j]))                
                coun[i]++;                
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(country[i].equals(country[j]))
                coun[i] = 0;    
            }    
        }    
        for(int i=0;i<=n-1;i++)
        {
            if(coun[i]==0)
            continue;
            System.out.println(country[i]+" "+coun[i]);
        }    
    }        
}
