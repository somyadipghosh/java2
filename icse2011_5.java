import java.util.*;
public class icse2011_5
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i,j,t;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter weight:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<5;i++)
        System.out.println(a[i]);
    }
}