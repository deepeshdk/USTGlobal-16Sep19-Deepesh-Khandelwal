//Frequency of each Element from the positive Array
package ArrayPrograms;

import java.util.Scanner;

public class Array13
{
	static void freqElement(int []ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			if(ar[i]!=-1)
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						count++;
						ar[j]=-1;
					}
				}
					if(ar[i]!=-1)
						System.out.println(ar[i]+"--->"+count);	
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
