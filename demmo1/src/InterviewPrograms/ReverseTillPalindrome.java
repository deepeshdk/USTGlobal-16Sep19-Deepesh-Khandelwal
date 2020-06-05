package InterviewPrograms;
import java.util.Scanner;
public class ReverseTillPalindrome 
{
public static void main(String[] args) 
    {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int n = sc.nextInt();
	  int m = n;
	  int rev = 0;
	  while(n>0)
	  {
		  int r = n % 10;
		  rev = rev*10+r;
		  n = n/10;
	  }
	  System.out.println(rev);
	  if(rev==m)
	  System.out.println("Number is Palindrome");
	  else
		  System.out.println(add());
    }
public static int add()
{
	int k = rev+m;
}
}
