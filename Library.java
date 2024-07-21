//Calculating the tax of an employee
import java.util.*;
public class Library //Q3
{
    int price,day;
    String name;
    double fine;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the book: ");
        name=sc.nextLine();
        System.out.println("Enter the printed price of the book: ");
        price=sc.nextInt();
    }
    void cal()
    {
        if(day<=7)
        fine=25.0/100;
        else if(day>=8 && day<=15)
        fine=(25.0/100)+(day-7)*40.0/100;
        else if(day>=16 && day<=30)
        fine=(25.0/100)+(7*40.0/100)+(day-14)*60.0/100;
        else 
        fine=(25.0/100)+(7*40.0/100)+(14*60.0/100)+(day-30)*80.0/100;
    }
    void display()
    {
        System.out.println("NAME of the book : "+name);
        System.out.println("Fine to be paid : Rs."+fine);
    }
    public static void main(String args[])
    {
        Library ob=new Library();
        ob.input();
        ob.cal();
        ob.display();
    }
}