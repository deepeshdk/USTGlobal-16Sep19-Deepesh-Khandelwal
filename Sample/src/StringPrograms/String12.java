//Reverse the sentence
package StringPrograms;
import java.util.Scanner;
public class String12 
{
	static String reverseSentence(String st)
	{
	char ch[] = st.toCharArray();
	String rs = "";
	for (int i = ch.length-1;i>=0; i--) 
	{
		int k=i;
		while(i>=0 && ch[i]!=32)
		{
			i--;
		}
		int j=i+1;
		while(j<=k)
		{
			rs = rs+ch[j];
			j++;
		}
		if(i>=0)
		{
			rs = rs+ch[i];
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
	String rs = reverseSentence(s1);
	System.out.println("Reversed String is : "+rs);	

	}

}
