package InterviewPrograms;
import java.util.Scanner;
public class FindMissingNumber
{
	static int missEle(int a[],int n)
	{
		int sum=0;
		sum=(n+1)*(n+2)/2;
		for (int i = 0; i < n; i++) 
		{
			sum=sum-a[i];
		}
	return 	sum;
	}
	static int missingElement(int a[])
	{
		int n = a.length+1;
		n = n*(n+1)/2;
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		return n-sum;
	}
	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter the size of Array");
       int l=sc.nextInt();
       int a[] = new int[l];
       System.out.println("Enter the "+l+" elements");
       for (int i = 0; i < a.length; i++) 
       {
		a[i]=sc.nextInt();
	   }
       //int miss = missEle(a, a.length);
       int miss1 = missingElement(a);
       //System.out.println("Missing Number = "+miss);
       System.out.println("Missing Number = "+miss1);
	}

}
