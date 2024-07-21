// Java code to implement factorial
import java.util.*;
public class factorial_rec extends fibonacci_normal
{
 
  // Factorial function
  static int f(int n)
  {
 
    // Stop condition
    if (n == 0 || n == 1)
      return 1;
 
    // Recursive condition
    else
      return n * f(n - 1);
  }
 
  // Driver code
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
    System.out.println("factorial of " + n + " is: " + f(n));
  }
}