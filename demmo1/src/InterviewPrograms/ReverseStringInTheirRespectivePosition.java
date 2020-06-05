package InterviewPrograms;
import java.util.Scanner;
public class ReverseStringInTheirRespectivePosition 
{
	static String revWord(String str)
	{
		char ch[] = str.toCharArray();
		String rs = "";
		for (int i = 0; i < ch.length; i++) 
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				rs=rs+ch[j];
				j--;
			}
			if(i<ch.length)
			{
				rs=rs+ch[i];
			}
		}
		return rs;
	}
	public static void main(String[] args)
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String:");
     String s = sc.nextLine();
     String res=revWord(s);
     System.out.println("String in reverse is "+res);
	}

}
