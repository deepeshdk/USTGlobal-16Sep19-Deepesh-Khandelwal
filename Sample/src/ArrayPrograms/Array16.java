//Insert one Array element into another at specified index
package ArrayPrograms;

import java.util.Scanner;

public class Array16 
{
	static int [] insertElementArr(int []ar,int br[],int in)
	{
		if(in<0||in>ar.length)
		{
			System.out.println("Index is not found");
		return ar;
		}
		int cr[] = new int[ar.length+br.length];
		for(int i=0;i<br.length;i++)
		{
			cr[in+i] = br[i];
		}
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				cr[i]=ar[i];
			else
				cr[br.length+i] = ar[i];
		}
		return cr;
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
	System.out.println("Enter the first Array");
	int a[] = readArr();
	
	System.out.println("Enter the second Array");
	int b[] = readArr();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Index");
	int n =sc.nextInt() ;
	 int []c = insertElementArr(a, b, n);
	
	 System.out.println("Entered Array");
	  displayArr(a);
	  
	  System.out.println("New Array");
	  displayArr(c);
	}
}

