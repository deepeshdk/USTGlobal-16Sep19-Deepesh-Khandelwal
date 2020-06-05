package twoDArrayPrograms;
import java.util.Scanner;
public class Accept2dArrayUser 
{
public static void main(String[] args)
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
System.out.println("User entered matrix elements");
for (int i = 0; i < a.length; i++) 
{
        for (int j = 0; j < a[i].length; j++)
        { 
        	System.out.print(a[i][j]+" ");
		}	
        System.out.println();
}
	}
}