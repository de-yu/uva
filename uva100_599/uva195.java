

package uva100_599;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva195
{
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        Backtracking b = new Backtracking(); 
        int a = scanner.nextInt();
        for(int i=0;i<a;i++)
        {
            String str = scanner.next();
            String data[] = new String[str.length()];
            String s = "";
            for(char C='A',c='a';C<='Z';C++,c++)
            {
                String big = "",small = "";
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(j)==C)
                        big = big + Character.toString(C);
                    if(str.charAt(j)==c)
                        small = small + Character.toString(c);
                }
                s = s + big + small;
            }
            for(int j=0;j<str.length();j++)
                data[j] = Character.toString(s.charAt(j));
            b.nonMultiplePermutations(data,"");
        }            
    } 
}
class Backtracking
{
        boolean use[] = new boolean[100];   
    public void nonMultiplePermutations(String data[],String answer)//data need (Arranged according to size) answer = ""
    {
        if(answer.length()==data.length)
        {
            System.out.println(answer);
            return;
        }
        String last_str = "";
        for(int i=0;i<data.length;i++)
        {
            if(!use[i])
            {
                if(!data[i].equals(last_str))
                {
                    last_str = data[i];
                    use[i] = true;
                    nonMultiplePermutations(data,answer+data[i]);
                    use[i] = false;
                }
            }    
        }
    }
}