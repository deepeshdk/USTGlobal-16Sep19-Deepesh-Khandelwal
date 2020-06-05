//Union of two set
package ArrayPrograms;
import java.util.Scanner;
public class Array18 
{
	static int[] union(int a[],int b[])
	{
		int []c = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) 
		{
		     c[i] = a[i];	
		}
		int k = a.length;
		for (int i = 0; i < b.length; i++)
		{
			boolean find = true;
			for (int j = 0; j < a.length; j++)
			{
				if(b[i]==a[j])
				{
				find = false;
				break;
				}
			}
			if(find)
			{
				c[k++] = b[i];
			}
		}
			int na[] = new int[k];
		    for (int i = 0; i < k; i++)
		    {
			   na[i] = c[i];	
			}   
		    return na;
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

	
	 System.out.println("Entered first Array");
	  displayArr(a);
	  
	  System.out.println("Entered second Array");
	  displayArr(b);
	  
	  System.out.println("Union of Two Array is :");
	 int []c=union(a, b);
	      displayArr(c);
	}


}
