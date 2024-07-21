import java.util.*;
public class Midname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int l,i,fs=0,ls=0;
        System.out.print("ENTER FULL NAME: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                fs=i;
                break;
            }
        }
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                ls=i;
            }
        }
        if(fs==ls)
        System.out.println("No middle name");
        else
        System.out.println("Middle name: "+s.substring(fs+1,ls));
    }
}