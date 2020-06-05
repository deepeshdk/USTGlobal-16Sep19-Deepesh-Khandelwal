package InterviewPrograms;
import java.util.Scanner;
public class Fibonacci1
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Range:");
       int n = sc.nextInt();
       int f1=0;
       int f2=1;
       int f3=0;
       for (int i = 0; i < n; i++) 
       {
		System.out.println(f1);
		f3 = f1+f2;
		f1=f2;
		f2=f3;
	   }
	}
}
