//Find Least Element in Array
package ArrayPrograms;

import java.util.Scanner;

public class Array6 
{
	static int leastElement(int []x)
	{
		int least = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(least>x[i])
				least=x[i];
		}
		return least;
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
		int least = leastElement(ar);
		System.out.println("Least Element in the Array : "+least);

	}

}
