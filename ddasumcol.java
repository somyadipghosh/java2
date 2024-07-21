import java.util.*;
public class ddasumcol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][5];
        int i,j;
        int s;
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print("Enter ");
                a[i][j]=sc.nextInt();
            }
        }
        
        for(j=0;j<5;j++)//coloum
        {
            s=0;
            for(i=0;i<4;i++)
            {
                s=s+a[i][j];
            }
            System.out.println("Sum of col "+(j+1)+":"+s);
        }
    }
}