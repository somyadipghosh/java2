import java.util.*;
public class ddasumrow
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
System.out.println("Enter ");
a[i][j]=sc.nextInt();
}
}

for(i=0;i<4;i++)
{
s=0;
for(j=0;j<5;j++)
{
s=s+a[i][j];
}
System.out.println("Sum of Row "+(i+1)+":"+s);
}
}
} 