package InterviewPrograms;
import java.util.Scanner;
public class FactorialRecursion 
{
	static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		else
		return n*fact(n-1);
	}
	static boolean isPrime(int n,int i)
	{
		if(n%i==0)
			return false;
		if(i>n/2)
			return true;
		return isPrime(n, i+1);
	}
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = sc.nextInt();
       int m = fact(n);
       System.out.println("Factorial of a number is "+m);
       System.out.println("Enter the divisor:");
       int i = sc.nextInt();
       boolean r = isPrime(n, i);
       if(r)
    	   System.out.println("Prime");
       else
    	   System.out.println("Not Prime");
	}

}
