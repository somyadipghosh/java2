// A Java program to demonstrate working of
// recursion
import java.util.*;
public class GFG {
	static void printFun(int test)
	{
		if (test < 1)
			return;
		else {
			System.out.printf("%d ", test);
			printFun(test - 1); // statement 2
			System.out.printf("%d ", test);
			return;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
	        Scanner sc=new Scanner(System.in);
		int test;
		System.out.println("Enter value of test:");
		test=sc.nextInt();
		printFun(test);
	}
}