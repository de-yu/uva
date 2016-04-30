
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;

public class uva11462 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                break;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            StringBuffer sb = new StringBuffer("");
            int data[] = new int[a];
		
            for(int i=0;i<a;i++)
                data[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(data);
            sb.append(data[0]);
            for(int i=1;i<a;i++)
            {
                sb.append(" "+data[i]);
            }
            System.out.println(sb);
	}
    }
}
