package uva;

//計算出在n個字串中各個英文字母出現的次數
import java.util.*;
public class uva10008 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
        int a = Integer.parseInt(scanner.nextLine());
        int data[] = new int[26];
        
        for(int i=0;i<a;i++)
        {
            String str = scanner.nextLine();
            str = str.toUpperCase();
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)<=90&&str.charAt(j)>=65)
                    data[(int)str.charAt(j)-65]++;
            }
        }
        for(int i=0;i<26;i++)
        {
            int min = 0;
            char c = '\0';
            for(int j=0;j<26;j++)
            {
                if(data[j]>min)
                {
                    min = data[j];
                    c = (char)(j+65);
                }
            }
            if(min==0)
                break;
            else
            {
                System.out.println(c+" "+min);
                data[(int)c-65] = 0;
            }
        }
    }            
}
