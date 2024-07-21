//sort the roll numbers ascendingly according to the marks
import java.util.*;
public class markssorting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r[]=new int[5];
        int m[]=new int[5];
        int i,j,t;
        System.out.println("Enter roll and marks: ");
        for(i=0;i<5;i++)
        {
            r[i]=sc.nextInt();
            m[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                    t=r[j];
                    r[j]=r[j+1];
                    r[j+1]=t;
                }
            }
        }
        System.out.println("sorted elements");
        for(i=0;i<5;i++)
        {
            System.out.println(r[i]+"\t"+m[i]);
        }
    }
}