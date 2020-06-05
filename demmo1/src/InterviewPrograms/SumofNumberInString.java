package InterviewPrograms;
import java.util.Scanner;
public class SumofNumberInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String:");
	    String s = sc.next();
	    char ch[]= s.toCharArray();
	    int sum=0;
	    for (int i = 0; i < ch.length; i++) 
	    {
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum += ch[i]-48;
			}
		}
	    System.out.println("Sum is "+sum);
	}

}
