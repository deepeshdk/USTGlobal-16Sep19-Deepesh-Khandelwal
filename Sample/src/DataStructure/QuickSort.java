package DataStructure;
import java.util.Scanner;
public class QuickSort 
{
	static void quickSort(int ar[],int l,int h)
	{
		int j = partition(ar,l,h);
		quickSort(ar, l, j-1);
		quickSort(ar, j+1, h);
		
	}
static int partition(int[] ar, int l, int h) 
{
	int p = ar[l];
	int i = l+1;
	int j = h;
	while(i<j)
	{
	while(ar[i]<p && i<h)
		i++;
	while(ar[j]>p)
		j--;
	if(i<j)
	{
		int t = ar[j];
		ar[i] = ar[j];
		ar[j] = t;
	}
	}
	ar[l] = ar[j];
	ar[j] = p;
		return j;
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
	
	quickSort(a, 0, a.length-1);
}
}