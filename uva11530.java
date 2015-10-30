import java.io.*;
import java.util.*;
public class uva11530
{
    public static void main(String[] args)throws IOException
    {
       Scanner scanner = new Scanner(new BufferedInputStream(System.in));
      
        int data[] = {0,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=a;i++)
        {
            String str = scanner.nextLine();
            int sum = 0;
            for(int j=0;j<str.length();j++)
            {
                if((int)str.charAt(j)==32)
                    sum = sum + 1;
                else
                    sum = sum + data[(int)str.charAt(j)-96];
            }
            System.out.println("Case #"+i+": "+sum);
        }           
    }
}
