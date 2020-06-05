//Reverse Every word in the sentence 
package StringPrograms;
import java.util.Scanner;
public class String11 
{
	static String reverse(String st)
	{
	char ch[] = st.toCharArray();
	String rs = "";
	for (int i = 0; i < ch.length; i++) 
	{
		int k=i;
		if(i==0 && ch[i]!=32 || ch[i]!=32 && ch[i-1]==32)
		{
		while(i<ch.length && ch[i]!=32)
		{
			i++;
		}
		int j=i-1;
		while(j>=k)
		{
			rs = rs+ch[j];
			j--;
		}
		if(i<ch.length)
		{
			rs = rs+ch[i];
		}
	}
}
	return rs;
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s1 = sc.nextLine();
	sc.close();
	String rs = reverse(s1);
	System.out.println("Reversed String is : "+rs);	
 }
}