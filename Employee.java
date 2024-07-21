//Calculating the tax of an employee
import java.util.*;
public class Employee //Q3
{
    int pan;
    String name;
    double taxincome,tax;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the employee: ");
        name=sc.nextLine();
        System.out.println("Enter the pan number: ");
        pan=sc.nextInt();
        System.out.println("Enter the taxable income: ");
        taxincome=sc.nextDouble();
    }
    void cal()
    {
        if(taxincome<=250000)
        tax=0;
        else if(taxincome>=250001 && taxincome<=500000)
        tax=(taxincome*10.0/100.0);
        else if(taxincome>=500001 && taxincome<=1000000)
        tax=((taxincome*20.0/100.0)+30000);
        else
        tax=((taxincome*30.0/100.0)+50000);
    }
    void display()
    {
        System.out.println("PAN NUMBER : "+pan);
        System.out.println("NAME : "+name);
        System.out.println("TAX-INCOME : Rs."+taxincome);
        System.out.println("TAX : Rs."+tax);
    }
    public static void main(String args[])
    {
        Employee ob=new Employee();
        ob.input();
        ob.cal();
        ob.display();
    }
}