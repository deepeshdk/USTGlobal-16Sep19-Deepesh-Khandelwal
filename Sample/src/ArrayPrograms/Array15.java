//Without comparing each other find count of each element in +ve Array
package ArrayPrograms;

import java.util.Scanner;

public class Array15 
{
	static void freqElement(int []ar)
	{
		int big = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		int count[]=new int[big+1];
		for(int i=0;i<ar.length;i++)
		{
			count[ar[i]]++;
		}
		for(int i=0;i<count.length;i++)
		{
		if(count[i]!=0)
			System.out.println(i+"--->"+count[i]);
		}
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
	 freqElement(a);
	
	 System.out.println("Entered Array");
	  displayArr(a);
	}
}


