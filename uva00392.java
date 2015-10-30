package uva;

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class uva00392 
{
    public static void main(String args[])throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            if(str.equals("EOF"))
                break;
            StringTokenizer st = new StringTokenizer(str);
            StringBuffer sb = new StringBuffer("");
            int data[] = new int[9];
            for(int i=0;i<9;i++)
                data[i] = Integer.parseInt(st.nextToken());
            
            boolean first = false;
            for(int i=0,j=8;i<9;i++,j--)
            {
                String s = "";
            
                if(data[i]>0)
                {
                   s = s + (!first?"":" + ");
                   s = s + (data[i]==1&&j!=0?"":data[i]); 
                   if(j==1)
                        s = s + "x";
                    else if(j!=0)
                        s = s + "x^"+j;
                    first = true;
                }
                else if(data[i]<0)
                {
                  
                    s = s + (!first?"-":" - "); 
                    s = s + (data[i]==-1&&j!=0?"":Math.abs(data[i]));
                    if(j==1)
                        s = s + "x";
                    else if(j!=0)
                        s = s + "x^"+j;
                     first = true;
                }
                sb.append(s);
            }
            if(sb.toString().equals(""))
                System.out.println("0");
            else
             System.out.println(sb);
        }
    }        
}
