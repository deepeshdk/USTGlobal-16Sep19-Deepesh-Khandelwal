package InterviewPrograms;
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
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n = sc.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the "+n+" Sorting values of Array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		    insertionSort(ar);
	}
}