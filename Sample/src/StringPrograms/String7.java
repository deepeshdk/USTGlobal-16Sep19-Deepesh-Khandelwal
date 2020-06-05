//Count number of words present in a sentence
package StringPrograms;
import java.util.Scanner;
public class String7 
{
	static int countWords(String st)
	{
		int count=0;
		for (int i = 0; i < st.length(); i++)
		{
			char ch[] = st.toCharArray();
			if(i==0&&ch[i]!= 32 || ch[i]!=32&&ch[i-1]==32)
				count++;
		}
		return count;
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		sc.close();
		int rs = countWords(s1);
		System.out.println("Counted Number in String are : "+rs);
     }
}