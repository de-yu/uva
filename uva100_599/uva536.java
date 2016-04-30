
package uva100_599;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.regex.*;

public class uva536 
{
      public static void main(String[] args)throws IOException
    {

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(scanner.hasNext())
        {
            String a = scanner.next();
            String b = scanner.next();
            
            Tree tree = new Tree();
            
            toTree(a,b , tree);
            answer = "";
            postorder(tree);
            System.out.println(answer);
        }
        
            
    }
    static String answer = "";
    public static void postorder(Tree tree)
    {
        if(!tree.str.equals(""))
        {
            postorder(tree.left);
            postorder(tree.right);
            answer = answer + tree.str;
        }
    }
    
    public static void toTree(String pre , String in ,Tree tree)
    {

        if(pre.length()>0)
        {
        String root = Character.toString(pre.charAt(0));
        int pos = 0;
        for(int i=0;i<in.length();i++)
        {
            if(root.charAt(0)==in.charAt(i))
            {
                pos = i;
                break;
            }
        }

            String inleft = in.substring(0, pos)
                    ,inright = in.substring(pos+1)
                     ,preleft=pre.substring(1, inleft.length()+1)
                        ,preright = pre.substring(inleft.length()+1);         
            
            tree.left = new Tree();
            toTree(preleft, inleft ,tree.left);
              tree.right = new Tree(); 
            toTree(preright ,inright ,tree.right);
        
        tree.str = root;
        
        }
    }

}
class Tree
{
    String str = "";
    Tree left;
    Tree right;
}
