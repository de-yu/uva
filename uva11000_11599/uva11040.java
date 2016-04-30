
package uva11000_11599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva11040 
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        int n = scanner.nextInt();
        
        while(n-->0)
        {
            int layer[][] = new int[9][9];
            int minNumber = -10000;
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    layer[i][j] = minNumber;
            int num = 1;
            for(int i=0;i<9;i+=2)
            {
                for(int j=0;j<num;j++)
                {
                    layer[i][j*2] = scanner.nextInt();
                }
                num++;
            }
            
            for(int i=1,j=0;i<=7;i+=2,j+=2)
                layer[8][i] = (layer[6][j] - layer[8][i-1] - layer[8][i+1])/2;
            
            for(int i=8;i>=0;i--)
            {
                for(int j=0;j<8;j++)
                {
                    if(j+1>9)
                        break;
                    if(layer[i][j+1]==minNumber)
                        break;
                    layer[i-1][j] = layer[i][j] + layer[i][j+1];
                }
            }
            
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(layer[i][j]!=minNumber){
                        if(j==0)
                            sb.append(layer[i][j]);
                        else
                            sb.append(" "+layer[i][j]);
                    }                        
                }
                sb.append("\n");
            }
            System.out.print(sb);   
        }
    }
}
