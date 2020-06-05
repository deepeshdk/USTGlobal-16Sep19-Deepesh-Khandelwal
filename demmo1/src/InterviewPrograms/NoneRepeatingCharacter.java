package InterviewPrograms;
import java.util.Scanner;
public class NoneRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String:");
	    String s = sc.nextLine();
	    char ch[] = s.toCharArray();
	    for (int i = 0; i < ch.length; i++) 
	    {
	    	boolean found = true;
			for (int j = 0; j < ch.length; j++) 
			{
				if(i != j && ch[i]==ch[j])
				{
					found = false;
					break;
				}
			}
			if(found)
			{
				System.out.println("First Non Repeating Character is :"+ch[i]);
				//break;
			}
		}
	}
}
