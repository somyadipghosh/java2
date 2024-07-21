import java.util.*; 
class fibonacciseries_recur
{
 
// Function for fibonacci
static int fib(int n)
{
    // Stop condition
    if (n == 0)
        return 0;
 
    // Stop condition
    if (n == 1 || n == 2)
        return 1;
 
    // Recursion function
    else
        return (fib(n - 1) + fib(n - 2));
}
 
// Driver Code
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    // Initialize variable n.
    int n;
    System.out.println("Enter value of n: ");
    n=sc.nextInt();
    System.out.print("Fibonacci series of "+n+" numbers is: ");
 
    // for loop to print the fiboancci series.
    for (int i = 0; i < n; i++)
    {
        System.out.print(fib(i)+" ");
    }
}
}