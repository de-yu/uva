

package uva;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva10905 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
                int num;
                while ((num = scanner.nextInt()) != 0) {
                        ArrayList<String> all = new ArrayList<String>();
                        for (int i = 0; i < num; i++) {
                                all.add(scanner.next());
                        }
                        Collections.sort(all, comptr);
                        StringBuilder sb = new StringBuilder("");    
                        for (String s : all) {
                                sb.append(s);
                        }
                        System.out.println(sb);
                }
                
            
    }

        public static Comparator<String> comptr = new Comparator<String>() {
                public int compare(String s1, String s2) {
                        String n1n2 = s1 + s2;
                        String n2n1 = s2 + s1;

                        if(n2n1.compareTo(n1n2)>0)
                            return 1;
                        else if(n2n1.compareTo(n1n2)<0)
                            return -1;
                        else
                            return 0;
                }
        };
}
