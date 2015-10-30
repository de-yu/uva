

package uva4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
public class uva00587 
{
     public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        
        int n = 1;
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            if(str.equals("END"))
                break;
            str = str.substring(0,str.length()-1);
            
            String data[] = str.split(",");
            double x = 0,y = 0;
            double two = Math.sqrt(2);
            for(int i=0;i<data.length;i++)
            {
                String rotation = data[i].substring(data[i].length()-2,data[i].length());
                String rotation2 = data[i].substring(data[i].length()-1,data[i].length());
                
  
                
                if(rotation.equals("NE"))
                {
                    String num = data[i].substring(0, data[i].length()-2);
                    x = x + Double.parseDouble(num)/two;
                    y = y + Double.parseDouble(num)/two;
                }
                else if(rotation.equals("SE"))
                {
                     String num = data[i].substring(0, data[i].length()-2);
                    x = x + Double.parseDouble(num)/two;
                    y = y - Double.parseDouble(num)/two;
                }
                else if(rotation.equals("SW"))
                {
                     String num = data[i].substring(0, data[i].length()-2);
                    x = x - Double.parseDouble(num)/two;
                    y = y - Double.parseDouble(num)/two;
                }
                else if(rotation.equals("NW"))
                {
                     String num = data[i].substring(0, data[i].length()-2);
                    x = x - Double.parseDouble(num)/two;
                    y = y + Double.parseDouble(num)/two;
                }
                else if(rotation2.equals("N"))
                {
                    String num = data[i].substring(0, data[i].length()-1);
                     y = y + Double.parseDouble(num);
                }
                else if(rotation2.equals("E"))
                {
                     String num = data[i].substring(0, data[i].length()-1);
                     x = x + Double.parseDouble(num);
                }
                else if(rotation2.equals("S"))
                {
                     String num = data[i].substring(0, data[i].length()-1);
                     y = y - Double.parseDouble(num);
                }
                else if(rotation2.equals("W"))
                {
                     String num = data[i].substring(0, data[i].length()-1);
                     x = x - Double.parseDouble(num);
                }
            }
            System.out.println("Map #"+n);
            System.out.printf("The treasure is located at (%.3f,%.3f).%n",x,y);
            System.out.printf("The distance to the treasure is %.3f.%n",Math.sqrt(x*x+y*y));
            n++;
        }
    }
}
