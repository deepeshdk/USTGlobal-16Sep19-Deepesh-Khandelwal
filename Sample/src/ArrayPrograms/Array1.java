package ArrayPrograms;
import java.util.Scanner;
public class Array1 
{
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
	        //Displaying an Array
	        System.out.println("Entered values are:");
	        for(int i=0;i<ar.length;i++)
	        {
	        System.out.println(i+" --->"+ar[i]);	
	        }
	}
}
