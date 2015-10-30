
package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00378 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        
        int a = scanner.nextInt();
        Double data[] = new Double[8];
        System.out.println("INTERSECTING LINES OUTPUT");
        while(a>0)
        {
            for(int i=0;i<8;i++)
                data[i] = scanner.nextDouble();
            
            Double a1 = data[1] - data[3];
            Double b1 = data[2] - data[0];
            Double c1 = data[1]*b1 + data[0]*a1;
            Double a2 =  data[5] - data[7];
            Double b2 = data[6] - data[4];
            Double c2 = data[5]*b2 + data[4]*a2;
            
            Double n1 = 0.0,n2 = 0.0,n3 = 0.0;
            n1 = a1*b2-a2*b1;
            n2 = c1*b2-c2*b1;
            n3 = a1*c2-a2*c1;

            if(n1==0&&n2==0&&n3==0)
                System.out.println("LINE");
            else if(n1==0&&(n2!=0||n3!=0))
                System.out.println("NONE");
            else
                System.out.printf("POINT %.2f %.2f%n",n2/n1,n3/n1);
            
            a--;
        }
        System.out.println("END OF OUTPUT");
    }
}
