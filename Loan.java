import java.util.*;
public class Loan
{
    int time;
    double principal;
    double rate,interest,amt;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        principal=sc.nextDouble();
        System.out.print("Enter time:");
        time=sc.nextInt();        
    }
    public void cal()
    {
        if(time<=5)
        interest=(principal*15.0*time)/100;
        else if(time>5 && time<=10)
       interest=(principal*12.0*time)/100;      
        else
       interest=(principal*10.0*time)/100;
       amt = principal+interest;
    }
    
    public void display()
    {
        System.out.println("interest\tamt");
        System.out.println(interest+"\t"+amt);
    }

    public static void main(String args[])
    {
        Loan ob=new Loan();//object creation
        ob.getdata();
        ob.cal();
        ob.display();
    }
}