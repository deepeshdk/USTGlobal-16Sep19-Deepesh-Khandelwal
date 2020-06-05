//Define a Method to update the Array values by 5.
package ArrayPrograms;
import java.util.Scanner;
public class Array3 
{
static void upDate(int x[])
{
	System.out.println("After Update");
	for(int i=0;i<x.length;i++)
	{
		x[i]=x[i]+5;
	      
		System.out.println(x[i]);
	}
}
public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many values you have :");
    int n = sc.nextInt();
    int ar[]=new int[n];
	//Reading a Array
    System.out.println("Enter the "+n+ " values");
        for(int i=0;i<ar.length;i++)
        {
    ar[i] = sc.nextInt();
        }
	System.out.println("Before Update");
	for(int i=0;i<ar.length;i++)
    {
	System.out.println(ar[i]+" ");
	}
	System.out.println();
       upDate(ar);
 
       /*for(int i=0;i<ar.length;i++)
       {
    	   System.out.println(ar[i]+" ");
       }*/
}
}