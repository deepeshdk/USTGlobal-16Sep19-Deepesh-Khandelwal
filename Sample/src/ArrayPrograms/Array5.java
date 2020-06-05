//find BIGGEST Element in Array
package ArrayPrograms;
import java.util.Scanner;
public class Array5 
{
static int biggestElement(int []x)
{
	int big = x[0];
	for(int i=0;i<x.length;i++)
	{
		if(big<x[i])
			big=x[i];
	}
	return big;
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you have ");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the number of values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
			int big = biggestElement(ar);
			System.out.println();
			System.out.println("Biggest Element in Array is : "+big);
	}
}
