//insert a number in the array and the array is previously sorted
//in a proper location of the sorted array.
import java.util.*;
public class ins_sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[11];
        int i,j,t,n,p=0;
        System.out.println("Enter the elements");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n<=a[0])
        p=0;
        else if(n>=a[9])
        p=10;
        else
        {
            for(i=0;i<9;i++)
            {
                if(n>=a[i]&&n<=a[i+1])
                {
                    p=i+1;
                    break;
                }
            }
        }
        for(i=0;i>p;i--)
        a[i]=a[i+1];
        a[p]=n;
        for(i=0;i<11;i++)
        System.out.println(a[i]+" ");
    }
}