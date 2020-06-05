//Sum of Array by using Method
package ArrayPrograms;
import java.util.Scanner;
public class Array2 
{
	static int sumOfArray(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum = sum+x[i];
		return sum;
	}
public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you have :");
        int n = sc.nextInt();
        int ar[]=new int[n];
            //Reading a Array
        System.out.println("Enter the "+n+ " values");
	        for(int i=0;i<ar.length;i++)
	        {
        ar[i] = sc.nextInt();
	        }
	System.out.println("Sum of Array Elements are:");
	int sum=sumOfArray(ar);
	System.out.println("Sum is: "+sum);
	}
}
