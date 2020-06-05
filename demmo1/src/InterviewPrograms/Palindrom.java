package InterviewPrograms;
import java.util.Scanner;
public class Palindrom
{
	static int getPalindrome(int a)
	{
		int rev=0;
		while(a>0)
		{
		int r =a%10;
		rev = rev*10+r;
		a =a/10;
		}
		return rev;
	}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int n = sc.nextInt();
	int b=n;
	int a = getPalindrome(n);
	if(a==b)
	System.out.println("Palindrom");
	else
		System.out.println("Not Palindrom");
		
	}

}
