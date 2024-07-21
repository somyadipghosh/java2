import java.util.*;
public class Fstname
{
public static void main(String args[])
{
String s;
int l,i,c=0;
Scanner sc=new Scanner(System.in);
System.out.print("ENTER A FULL NAME: ");
s=sc.nextLine();
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c=i;
break;
}
}
System.out.println("First name: "+s.substring(0,c));
}
} 