
package uva11000_11599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11222 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int a = scanner.nextInt();
        
        for(int m=1;m<=a;m++)
        {
            int one[] = new int[scanner.nextInt()];
            for(int i=0;i<one.length;i++)
                one[i] = scanner.nextInt();
            int two[] = new int[scanner.nextInt()];         
            for(int i=0;i<two.length;i++)
                two[i] = scanner.nextInt();
            int three[] = new int[scanner.nextInt()];
            for(int i=0;i<three.length;i++)
                three[i] = scanner.nextInt();
            boolean oneboo[] = new boolean[one.length];
            boolean twoboo[] = new boolean[two.length];
            boolean threeboo[] = new boolean[three.length];
            Arrays.sort(one);
            Arrays.sort(two);
            Arrays.sort(three);
            
            int num[] = {one.length,two.length,three.length};
         
            math(one,two,oneboo,twoboo,num,0,1);
            math(one,three,oneboo,threeboo,num,0,2);
            math(two,three,twoboo,threeboo,num,1,2);
            
            int max = Math.max(num[0],Math.max(num[1], num[2]));
            StringBuffer sb = new StringBuffer("");
            out(one,oneboo,num,sb,0,max);
            out(two,twoboo,num,sb,1,max);
            out(three,threeboo,num,sb,2,max);
            System.out.printf("Case #%d:%n",m);
            System.out.print(sb);
            
        }
    }
    public static void math(int one[],int two[],boolean oneboo[],boolean twoboo[],int num[],int a,int b)
    {
         for(int i=0;i<one.length;i++)
            {
                for(int j=0;j<two.length;j++)
                {
                    if(one[i]==two[j]&&oneboo[i]==false&&twoboo[j]==false)
                    {
                        oneboo[i] = true;
                        twoboo[j] = true;
                        num[a]--;
                        num[b]--;
                    }
                    else if(one[i]==two[j]&&oneboo[i]==false)
                    {
                        oneboo[i] = true;
                        num[a]--;
                    }
                    else if(one[i]==two[j]&&twoboo[j]==false)
                    {
                        twoboo[j] = true;
                        num[b]--;
                    }
                    if(two[j]>one[i])
                        break;
                }
            }
    }
    public static void out(int one[],boolean oneboo[],int num[],StringBuffer sb,int n,int max)
    {
         if(num[n]==max)
         {
                sb.append((n+1)+" "+num[n]);
                for(int i=0;i<one.length;i++)
                {
                    if(oneboo[i]==false)
                        sb.append(" "+one[i]);
                }
                sb.append("\n");
        }
    }
}
