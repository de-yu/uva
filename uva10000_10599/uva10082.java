package uva10000_10599;

import java.util.*;
public class uva10082 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String l1[] = {"`","1","2","3","4","5","6","7","8","9","0","-","="};
        String l2[] = {"Q","W","E","R","T","Y","U","I","O","P","[","]","\\"};
        String l3[] = {"A","S","D","F","G","H","J","K","L",";","'"};
        String l4[] = {"Z","X","C","V","B","N","M",",",".","/"};
        
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            String ans = "";
            for(int i=0;i<str.length();i++)
            {
                for(int j=0;j<l1.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l1[j]))
                    ans = ans + l1[j-1];                       
                }
                for(int j=0;j<l2.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l2[j]))
                    ans = ans + l2[j-1];   
                }
                for(int j=0;j<l3.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l3[j]))
                    ans = ans + l3[j-1];   
                }
                for(int j=0;j<l4.length;j++)
                {
                    if(Character.toString(str.charAt(i)).equals(l4[j]))
                    ans = ans + l4[j-1]; 
                }
                if(Character.toString(str.charAt(i)).equals(" "))
                    ans = ans + " ";
            }
            System.out.println(ans);
        }        
    }
}    

   
