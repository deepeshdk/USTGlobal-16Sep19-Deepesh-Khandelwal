//Insert Element into Passed Array at specified index
package ArrayPrograms;
import java.util.Scanner;
public class Array10 
{
	static int [] insertArr(int ar[],int ele,int in)
	{
		if(in<0||in>ar.length)
		{
			System.out.println("Index is not found");
			return  ar;
		}
		int na[]=new int[ar.length+1];
		na[in]=ele;
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				na[i]=ar[i];
			else
				na[i+1]=ar[i];
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
	System.out.println("Enter the Array");
	int a[] = readArr();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Element to insert ");
	int ele = sc.nextInt();
	System.out.println("Enter the Index to insert Element ");
	int in = sc.nextInt();
	int c[] = insertArr(a, ele, in);
	
	 System.out.println("Entered Array");
	  displayArr(a);
	 
	  System.out.println("New Array");
	  displayArr(c);
	}

}
