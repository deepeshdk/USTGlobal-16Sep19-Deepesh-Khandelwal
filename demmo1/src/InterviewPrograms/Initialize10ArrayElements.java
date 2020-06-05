package InterviewPrograms;
import java.util.Scanner;
public class Initialize10ArrayElements 
{
	public static void main(String[] args)
    {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i = 0;i<a.length;i++)
		{
			a[i] = sc.nextInt(); 
		}
		System.out.println("Array Elements Are:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	 }
}
