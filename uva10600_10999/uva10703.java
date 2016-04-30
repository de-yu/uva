
package uva10600_10999;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;
public class uva10703 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
      
        while(scanner.hasNextInt())
        {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int n = scanner.nextInt();
           if(a==0&&b==0&&n==0)
               break;
           int sum = a*b;
           int data[][] = new int[b][a];
           int input[] = new int[4];
           while(n-->0)
           {
               for(int i=0;i<4;i++)
                   input[i] = scanner.nextInt()-1;
               if(input[3]<input[1])
               {
                        input[3] = input[3]^input[1];
                        input[1] = input[3]^input[1];
                        input[3] = input[3]^input[1];
               }
               if(input[0]>input[2])
               {
                        input[0] = input[0]^input[2];
                        input[2] = input[0]^input[2];
                        input[0] = input[0]^input[2];
               }
               
               for(int i=input[1];i<=input[3];i++)
                   for(int j=input[0];j<=input[2];j++)
                   {
                       if(data[i][j]==0)
                       {
                           sum--;
                           data[i][j] = 1;
                       }
                   }
           }
           if(sum==0)
               System.out.println("There is no empty spots.");
           else if(sum==1)
                System.out.println("There is one empty spot.");
           else
               System.out.println("There are " + sum + " empty spots.");
        }
    }
}
