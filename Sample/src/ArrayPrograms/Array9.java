//Merge the Sorted Array in Sorted Format
package ArrayPrograms;

import java.util.Scanner;

public class Array9 
{
	static int [] mergeSort(int []a,int b[])
	{
		int []c = new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		return c;
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
	System.out.println("Enter the first Array");
	int a[] = readArr();
	System.out.println("Enter the second Array");
	int b[] = readArr();
	
	int c[] = mergeSort(a,b);
	
	 System.out.println("Entered first Array");
	  displayArr(a);
	 System.out.println("Entered second Array");
	  displayArr(b);
	  System.out.println("Combined Array");
	  displayArr(c);
	}

}
