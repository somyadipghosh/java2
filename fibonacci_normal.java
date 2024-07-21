import java.util.*;
public class fibonacci_normal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=1,b=1,c=0,n;
        System.out.println("Enter terms");
        n=sc.nextInt();
        System.out.print("0, "+"1, "+"1, ");
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+", ");
        }
    }
}