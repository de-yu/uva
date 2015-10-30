

package uva5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10344 
{
     public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int input[] = new int[5];
        String str[][] = new String[120][5];
        String data[] ={"0","1","2","3","4"};
        nonMultiplePermutations(data,"",str);

        while(scanner.hasNextInt())
        {
            for(int i=0;i<5;i++)
                input[i] = scanner.nextInt();
            Arrays.sort(input);
            if(input[0]==0&&input[1]==0&&input[2]==0&&input[3]==0&&input[4]==0)
                break;
            yes = false;
            for(int i=0;i<120;i++)
            {
                int num[] = new int[5];
                for(int j=0;j<5;j++)
                    num[Integer.parseInt(str[i][j])] = input[j];
                dfs(1,num,num[0]);
                if(yes)
                    break;
            }
            if(yes)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
            
        }
    }   
    static boolean  use[] = new boolean[5];
    static int a = 0;
    static boolean yes = false;
    public static void nonMultiplePermutations(String data[],String answer,String str[][])//data need (Arranged according to size) answer = ""
    {
        if(answer.length()==data.length)
        {
            for(int i=0;i<5;i++)
                str[a][i] = Character.toString(answer.charAt(i));
                a++;
            return;
        }
        for(int i=0;i<data.length;i++)
        {
            if(!use[i])
            {
                    use[i] = true;
                    nonMultiplePermutations(data,answer+data[i],str);
                    use[i] = false;
            }    
        }
    }
    public static void dfs(int n,int data[],int sum)
    {
        if(n==5)
        {
            if(sum==23)
                yes = true;
            return;
        }
        dfs(n+1,data,sum+data[n]);
        dfs(n+1,data,sum-data[n]);
        dfs(n+1,data,sum*data[n]);
    }
}
