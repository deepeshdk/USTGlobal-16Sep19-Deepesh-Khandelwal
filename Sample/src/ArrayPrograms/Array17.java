//Display all the pair of elements whose Sum=n
package ArrayPrograms;

import java.util.Scanner;

public class Array17
{
	static void pairSum(int n,int a[]) 
	{
		for (int i = 0; i < a.length-1; i++)
		{
           for (int j = i+1; j < a.length; j++) 
           {
			if(a[i]+a[j]==n)
			{
				System.out.println("Pair of Elements are :"+"("+a[i]+","+a[j]+")");
		}			
		}
		}
		
	}
	static int [] readArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n = sc.nextInt();
		int [] ar = new int[n];
	    System.out.println("Enter the "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	static void displayArr(int [] ar) 
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
	
	 System.out.println("Entered first Array");
	  displayArr(a);
	 pairSum(n, a);
	}

}