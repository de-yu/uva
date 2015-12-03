
package uva5;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00706 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int num[][] = {{0,2,3,5,6,7,8,9},{2,3,4,5,6,8,9},{0,2,3,5,6,8,9},{0,4,5,6,8,9},{0,1,2,3,4,7,8,9},{0,2,6,8},{0,1,3,4,5,6,7,8,9}};
        
        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            String b = scanner.next();
            if(a==0)
                break;
            String data[][] = new String[5+(a-1)*2][(3+(a-1))*b.length()];
            
            for(int i=0;i<5+(a-1)*2;i++)
                for(int j=0;j<(3+(a-1))*b.length();j++)
                    data[i][j] = " ";
            
            for(int i=0;i<b.length();i++)
            {
                for(int j=0;j<3;j++)
                {
                    for(int k=0;k<num[j].length;k++)
                    {
                        if((int)b.charAt(i)-48==num[j][k])
                        {
                            for(int h=0;h<a;h++)
                                data[(a+1)*j][1+i*(a+2)+h] = "-";
                        }
                    }
                }
                for(int j=3;j<5;j++)
                {
                    for(int k=0;k<num[j].length;k++)
                    {
                         if((int)b.charAt(i)-48==num[j][k])
                        {
                            for(int h=0;h<a;h++)
                                data[1+h][(j-3)*(a+1)+(i*(a+2))] = "|";
                        }
                    }
                }
                 for(int j=5;j<7;j++)
                {
                    for(int k=0;k<num[j].length;k++)
                    {
                         if((int)b.charAt(i)-48==num[j][k])
                        {
                            for(int h=0;h<a;h++)
                                data[a+2+h][(j-5)*(a+1)+(i*(a+2))] = "|";
                        }
                    }
                }
            }
            StringBuffer sb = new StringBuffer("");
            for(int i=0;i<5+(a-1)*2;i++)
            {
                for(int j=0;j<(3+(a-1))*b.length();j++)
                {
                    if((j-(a+1))%(a+2)==0&&(j+1)!=(3+(a-1))*b.length())
                    sb.append(data[i][j]+" ");
                    else
                    sb.append(data[i][j]);
                }
               sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
