package StringPrograms;
import java.util.Scanner;
public class DuplicateString 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String:");	
	    String s = sc.next();
	    char ch[] = s.toCharArray();
	    for (int i = 0; i < ch.length; i++) 
	    {
		   for (int j = i+1; j < ch.length; j++) 
		   {
			if(ch[i]==ch[j])
			{
				System.out.println("Duplicate characters are:"+ch[j]);
				break;
			}
		   }	
		}
	}
}
