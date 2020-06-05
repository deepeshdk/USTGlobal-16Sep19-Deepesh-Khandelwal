package DataStructure;
import java.util.Scanner;
public class MergeSort 
{
	static void mergeSort(int ar[],int l,int h)
	{
		if(l<h)
		{
			int m = (l+h)/2;
			mergeSort(ar, l, m);
			mergeSort(ar, m+1, h);
			merge(ar, l, m, h);
		}
	}
	static void merge(int[] ar, int l, int m, int h) 
	{
             int a[] = new int [m-l+1];
             int b[] = new int [h-m];
             for (int i = 0; i <=m; i++) 
             {
				a[i] = ar[l+1];
             }
				for (int i = 0; i <=h-m; i++) 
				{
				b[i] = ar[m+i+1];
				}
				int i = 0,j = 0;
				while(i<a.length && j<b.length)
				{
					if(a[i]<b[j])
						ar[l++] = a[i++];
						else
							ar[l++] = b[j++];
			}
			while(i<a.length)
			{
				ar[l++] = a[i++];
			}
			while(j<b.length)
			{
				ar[l++] = b[j++];
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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower index : ");
		int l = sc.nextInt();
		mergeSort(a,l,a.length-1);
	}
}