package StringPrograms;
import java.util.Scanner;
public class SortStringWithoutStringApi 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String:");	
	    String s = sc.next();
	    char ch[] = s.toCharArray();
	    char temp = 0;
	    for (int i = 0; i < ch.length; i++) 
	    {
		   for (int j = 0; j < ch.length; j++) 
		   {
			if(ch[j]>ch[i])
			{
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		   }	
		}
	    for (int i = 0; i < ch.length; i++) 
	    {
		    System.out.println("Sorted String is :"+ch[i]);	
		}
	} 

}
