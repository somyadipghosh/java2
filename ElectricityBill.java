import java.util.*;
public class ElectricityBill
{
    String n;
    int units;
    double bill;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the customer.");
        n=in.nextLine();
        System.out.println("Enter the no. of units consumed.");
        units=in.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        bill=units*2.0;
        else if(units<=300)
        bill=100*2.0+(units-100)*3.0;
        else
        {
            bill=100*2.0+200*3.0+(units-300)*5.0;
            bill=2.5/100.0*bill+bill;
        }
    }
    void display()
    {
        System.out.println("Name of the customer     : "+n);
        System.out.println("Number of units consumed : "+units);
        System.out.println("Bill Amount              : Rs."+bill);
    }
    public static void main(String args[])
    {
        ElectricityBill ob=new ElectricityBill();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
