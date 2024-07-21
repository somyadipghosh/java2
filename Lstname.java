import java.util.*;
public class Lstname
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s;
            int i,j,c=0;
            System.out.print(" ENTER A FULL NAME: ");
            s=sc.nextLine();
            int l=s.length();
            for(i=0;i<l;i++)
            {
                if(s.charAt(i)==' ')
                {
                    c=i;
                }
            }
            System.out.println("Last name: "+s.substring(c+1));
        }
    }