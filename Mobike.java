import java.util.*;
public class Mobike
{
    int bno,phno;    
    String name;
    int days ,charge;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bike no.:");
        bno=sc.nextInt();
        System.out.print("Enter phone no.:");
        phno=sc.nextInt();
        System.out.print("Enter no.of days:");
        days=sc.nextInt();
        System.out.print("Enter name:");
        name=sc.nextLine();
    }
    public void cal()
    {
        if(days<=5)
        charge=days*500;
        else if(days>5 && days<=10)
       charge=(5*500)+(days-5)*400;               
        else
       charge=(5*500)+(5*400)+(days-10)*200;
    }
    
    public void display()
    {
        System.out.println("bike no.\tphone no.\tname\tno.of days \t charge");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }

    public static void main()
    {
        Mobike ob=new Mobike();
        ob.input();
        ob.cal();
        ob.display();
    }
}