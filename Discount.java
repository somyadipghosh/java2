//Calculating the Discount of an article
import java.util.*;
public class Discount //Q4
{
   int cost;
String name;
double  dc,amt;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of the customer :");
name=sc.nextLine();
System.out.print("Enter the price of the article : Rs.");
cost=sc.nextInt();
}
void cal()
{
if(cost<=5000)
dc=0;
else if(cost>=5001 && cost<=10000)
dc=((cost/100.0)*10.0/100.0);
else if(cost>=10001 && cost<=15000)
dc=((cost/100.0)*15.0/100.0);
else
dc=((cost/100.0)*20.0/100.0);
amt=cost-dc;
}
void display()
{
    System.out.println("NAME : "+name);
 System.out.println("COST OF ARTICLE : "+cost);
 System.out.println("DISCOUNT TO BE PAID : "+dc);
 System.out.println("AMOUNT TO BE PAID : "+amt);
}
public static void main(String args[])
{
    Discount ob=new Discount();
    ob.input();
    ob.cal();
    ob.display();
    }
}