package DataStructure;
import java.util.Scanner;
public class InsertionSort 
{
	static void insertionSort(int []ar)
	{
		for (int i = 1; i < ar.length; i++) 
		{
			int key = ar[i];
			int j = i-1;
			while(j>=0 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1] = key;
		}
           for (int i = 0; i < ar.length; i++) 
		{
			System.out.println(ar[i]);

		}
	}
	static int [] readArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the "+n+" Sorting values");
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

		insertionSort(a);
	}
}