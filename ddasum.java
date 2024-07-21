import java.util.*;
public class ddasum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][5];
        int s=0;
        for(int i=0;i<4;i++)
        {
           for(int j=0;j<5;j++)
{
System.out.println("Enter ");
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<4;i++)
{
for(int j=0;j<5;j++)
{
s=s+a[i][j];
}
}
System.out.println("Sum: "+s);
}
} 