

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00386 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        ArrayList<String> data[] = new ArrayList[201];
        
        for(int i=0;i<201;i++)
            data[i] = new ArrayList<String>();
        
        for(int i=2;i<201;i++)
        {
            for(int j=i;j<201;j++)
            {
                for(int k=j;k<201;k++)
                {
                    int a = i*i*i + j*j*j + k*k*k;
                    for(int m=1;m<201;m++)
                    {
                        int b = m*m*m;
                        if(a==b)
                        {
                            data[m].add("("+i+","+j+","+k+")");
                        }
                        else if(b>a)
                            break;
                    }
                }
            }
        }
        
        for(int i=0;i<201;i++)
        {
            for(int j=0;j<data[i].size();j++)
            {
                System.out.printf("Cube = %d, Triple = %s%n",i,data[i].get(j));
            }
        }
    }
}
