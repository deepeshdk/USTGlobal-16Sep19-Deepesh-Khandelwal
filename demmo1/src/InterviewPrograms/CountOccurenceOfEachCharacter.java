package InterviewPrograms;
import java.util.Scanner;
public class CountOccurenceOfEachCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
        String s = sc.nextLine();
      int count[] = new int[128];
      for (int i = 0; i < s.length(); i++) 
      {
		char ch = s.charAt(i);
		count[ch]++;
	  }
      for (int i = 0; i < count.length; i++) 
      {
		if(count[i]!=0)
		{
			System.out.println((char)i+"----->"+count[i]);
		}
	  }
      System.out.println("-----------------");
      String st = "Little";
      int count1[] = new int[128];
      for (int i = 0; i < st.length(); i++) 
      {
		char ch = st.charAt(i);
		if(ch>='A' && ch<='Z')
		count1[ch-65]++;
		else if(ch>='a' && ch<='z')
			count1[ch-97]++;
	  }
      for (int i = 0; i < count1.length; i++) 
      {
		if(count1[i]!=0)
		{
			System.out.println((char)(i+65)+"----->"+count1[i]);
		}
	  }
	}
}