import java.util.Scanner;
public class EdurekaDiamond
{
public static void main(String args[])
{
int n, i, j,k;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();

for (i = 1; i<= n; i++)
{
    for (k = 1; k<=(n-i); k++)
    {
            System.out.print(" ");
    }

        for (j = 1; j <= (2 * i) - 1; j++)
        {
            System.out.print("*");
        }
    System.out.println("");
}

for (i-=2; i>=1; i--)
{
    for (k = (n-i); k>=1; k--)
    {
        System.out.print(" ");
    }

    for (j = (i*2)-1; j>=1; j--)
    {
        System.out.print("*");
    }
    System.out.println("");
}
}
}