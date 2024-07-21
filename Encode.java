import java.util.*;
public class Encode
{
    public static void main(String args[])
    {
        String s,s1="";
        int l,i,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='y')
            ch='a';
            else if(ch=='Y')
            ch='A';
            else if(ch=='z')
            ch='b';
            else if(ch=='Z')
            ch='B';
            else
            ch+=2;
            s1=s1+ch;
        }
        System.out.println("Encoded string: "+s1);
    }
}