import java.util.*;
public class ddaSortRowBubble
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][5];
        int i,j,r,t;
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.println("Enter ");
                a[i][j]=sc.nextInt();
            }
        }
        for(r=0;r<4;r++)
        {
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(a[r][j]>a[r][j+1])
                    {
                        t=a[r][j];
                        a[r][j]=a[r][j+1];
                        a[r][j+1]=t;
                    }
                }
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
} 