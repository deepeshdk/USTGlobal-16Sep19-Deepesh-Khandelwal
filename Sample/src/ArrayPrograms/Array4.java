//Product of Array
package ArrayPrograms;
import java.util.Scanner;
public class Array4 
{
	
	static int productOfArray(int[] x)
	{
		int product = 1;
		for(int i=0;i<x.length;i++)
		{
		product=product*x[i];
		}
		return product;
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
		int product = productOfArray(ar);
		System.out.println();
		System.out.println("Product of Array is : "+product);
	}

}
