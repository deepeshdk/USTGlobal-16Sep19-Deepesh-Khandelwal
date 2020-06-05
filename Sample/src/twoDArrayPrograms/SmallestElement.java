package twoDArrayPrograms;
import java.util.Scanner;
public class SmallestElement 
{
	static int[][] readMatrix()
	{
		int a[][];
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns ");
	int r = sc.nextInt();
	int c = sc.nextInt();
	a = new int [r][c];
	System.out.println("Enter the "+r*c+ " elements ");
	for (int i = 0; i < a.length; i++) 
	   {
		for (int j = 0; j < a[i].length; j++)
		{
			a[i][j] = sc.nextInt();
		}
		}
		return a;
	}
	static void displayMatrix(int[][]a)
	{
		for (int i = 0; i < a.length; i++) 
		{
		        for (int j = 0; j < a[i].length; j++)
		        { 
		        	System.out.print(a[i][j]+" ");
				}	
		        System.out.println();
		}
	}
	static int smallestElement(int a[][] )
	{
		int small = a[0][0];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
			   if(small>a[i][j])
			   {
				   small = a[i][j];
			   }
			}
		}
		return small;
	}
	public static void main(String[] args)
	{
		System.out.println("Read First Matrix Elements");
        int a[][] = readMatrix();
        System.out.println("Entered First Matrix :");
        displayMatrix(a);
        System.out.println("Smallest Element in Marix is :");
        int c = smallestElement(a);
       	System.out.println(c);
	}
}