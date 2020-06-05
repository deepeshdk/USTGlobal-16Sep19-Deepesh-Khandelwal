package twoDArrayPrograms;
import java.util.Scanner;
public class MethodToAddMatrixElement 
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
	static int [][] addMatrix(int[][]a,int[][]b)
	{
	   if(a.length!=b.length || a[0].length!=b[0].length)
	   {
		   System.out.println("Rows and Columns must be same");
		return null;
	   }
	int c[][] = new int[a.length][a[0].length];
	     for (int i = 0; i < c.length; i++) 
	     {
			for (int j = 0; j < c[i].length; j++) 
			{
			  c[i][j] = a[i][j]+b[i][j];	
			}
		}
	     return c;
	}
public static void main(String[] args) 
	{
         System.out.println("Read First Matrix Elements");
         int a[][] = readMatrix();
         System.out.println("Read Second Matrix Elements");
         int b[][] = readMatrix();
         System.out.println("Entered First Matrix :");
         displayMatrix(a);
         System.out.println("Enterd Second Matrix :");
         displayMatrix(b);
         System.out.println("Addition of Two Marix is :");
         int c[][] = addMatrix(a, b);
         if(c!=null)
         {
        	 System.out.println("Sum of A and B Matrix is :");
        	 displayMatrix(c);
         }
	}

}
