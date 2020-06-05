package DataStructure;
import java.util.Scanner;
public class SelectionSort
{
	static void selectionSort(int ar[])
	{
		for (int i = 0; i < ar.length; i++) 
		{
			int si = i;
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[si]>ar[j])
				{
					si=j;
				}
				int t = ar[si];
				ar[si] = ar[i];
				ar[i] = t;
			}
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
	
	 selectionSort(a);
}
}