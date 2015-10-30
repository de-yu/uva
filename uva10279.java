
package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10279 
{
       public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = scanner.nextInt();
        for(int k=0;k<n;k++)
        {
            int height = scanner.nextInt();
            int width = height;
            if(height==0)
                break;
            int data[][] = new int[height+2][width+2];         
            for(int i=0;i<height+2;i++)
            {
                data[i][0] = 9;
                data[i][width+1] = 9;
            }
            for(int i=0;i<width+2;i++)
            {
                data[0][i] = 9;
                data[height+1][i] = 9;
            }
            
            for(int i=0;i<height;i++)
            {
                String str = scanner.next();
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(j)=='*')
                        addone(i+1,j+1,data);
                }                
            }
            String ans = "";
            boolean boo = false;
              for(int i=0;i<height;i++)
            {
                String str = scanner.next();
                
                for(int j=0;j<str.length();j++)
                {  
                    boolean b = true;
                   if(data[i+1][j+1]<0)
                   {
                         ans = ans + "/"; 
                         b = false;
                   }
                   if(str.charAt(j)=='x')
                   { 
                       if(data[i+1][j+1]<0)
                            boo = true;             
                       else
                        ans = ans + data[i+1][j+1];
                   }
                   else
                   {
                       if(b)
                       ans = ans + ".";
                   }
                }
                ans = ans + "\n";
            }
            if(boo)
               ans = ans.replace('/', '*');
             else
                ans = ans.replace('/', '.');
           if(k>0)
            System.out.println();
           System.out.print(ans);
        }
    }
    public static void addone(int h,int w,int data[][])
    {
        int num_h[] = {-1,-1,-1,0,1,1,1,0};
        int num_w[] = {-1,0,1,1,1,0,-1,-1};
        
        for(int i=0;i<8;i++)
        {
            data[h+num_h[i]][w+num_w[i]]++;
        }
        data[h][w] = -10;
    }
}
