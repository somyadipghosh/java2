import java.util.*;
public class letter_jump
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=in.nextLine();
        s=s.trim().toUpperCase()+" ";
        String st=""; int i; char c; String w="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            w+=c;
            else
            {
                st+=w.charAt(w.length()-1)+w.substring(1,w.length()-1)+w.charAt(0)+" ";
                w="";
            }
        }
        System.out.println("New sentence: "+st);
    }
}