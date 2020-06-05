//convert every word first character into capital and remaining same
package StringPrograms;
import java.util.Scanner;
public class String8 
{
	static String convertFirstToUpper(String st)
	{
		char ch[] = st.toCharArray();
		for (int i = 0; i < st.length(); i++)
		{
			if(i==0 && ch[i]!= 32 || ch[i]!=32 && ch[i-1]==32)
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i] = (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i] = (char)(ch[i]+32);
			}
		}	
		return new String(ch);
	}
public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s1 = sc.nextLine();
	sc.close();
	String rs = convertFirstToUpper(s1);
	System.out.println("Converted String is : "+rs);
	}

}