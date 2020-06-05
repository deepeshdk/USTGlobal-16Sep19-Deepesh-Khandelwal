//Most majority Element from the Array and if it is not there return-1
//Majority Element is which occur more than half of the size of Array 
package ArrayPrograms;

import java.util.Scanner;

public class Array12 
{
	static int majorityElement(int n,int ar[])
	{
		for (int i = 0; i < n; i++) 
		{
			int count = 1;
			if(ar[i]!=-1)
				for(int j=i+1;j<n;j++)
				{
					if(ar[i]==ar[j])
					{
						count++;
						ar[j]=-1;
					}
				}
			if(count>n/2)
				return ar[i];
		}
		return -1;
	}
	static int [] readArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			 ar[i]=sc.nextInt();
		}
		return ar;
	}
	static void displayArr(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
			if(i<ar.length-1)
				System.out.print(",");
		}
        System.out.println();
	}
public static void main(String[] args) 
	{
	System.out.println("Enter the Array");
	int a[] = readArr();
	int n = a.length;
	int c = majorityElement(n, a);
	
	 System.out.println("Entered Array");
	  displayArr(a);
	 
	  System.out.println("Majority Element is "+c);
	}
}
