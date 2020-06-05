package InterviewPrograms;

import java.util.Scanner;

public class Fibonacci
{
	static void getFibonacci(int a)
	{
		int f1=0;
		int f2=1;
		while(a>0)
		{
			System.out.println("Fibonacci series are : "+f1);
		int f3=f1+f2;
		f1=f2;
		f2=f3;
		a--;
	}
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int n = sc.nextInt();
	 getFibonacci(n);
		}

}
