package InterviewPrograms;
import java.util.Scanner;
public class ArmStrong 
{
	static int getArmStrong(int a)
	{
		int sum=0;
        int c = getCount(a);
		while(a>0)
		{
	     int r = a%10;
		 sum=sum+pow(r,c);
		a = a/10;
		}
		return sum;
	}
static int pow(int a, int c) 
{
	int pow=1;
	while(c>0)
	{
	pow=pow*a;
	c--;
	}
		return pow;
	}
static int getCount(int a) 
 {
	int count=0;
	while(a>0)
	{
	count=count+1;
	a=a/10;
	}
		return count;
	}
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int b=n;
		int a = getArmStrong(n);
		if(a==b)
		System.out.println("ArmStrong");
		else
			System.out.println("Not ArmStrong");
	}

}
