package InterviewPrograms;
import java.util.Scanner;
public class PalindromeString 
{
//	static boolean isPalindrome(String st) 
//	{
//		int i=0;
//	if(st.charAt(i)!=' ' && st.length()>1)
//	{
//		while(i<=st.length()/2)
//		{
//			if(st.charAt(i)!=st.charAt(st.length()-i-1))
//			{
//				return false;
//			}
//			i++;
//		}
//	}
//		return true;
//	}
//	static boolean isPalin(String st)
//	{
//		System.out.println(st.length());
//		char ch[] = st.toCharArray();
//		int i= 0;
//		while(i<ch.length/2)
//		{
//			if(ch[i]!=ch[ch.length-i-1])
//		{
//			return false;
//		}
//		i++;
//		}
//		return true;
//	}
	static boolean isPali(String st)
	{
		String b ="";
		for(int i=st.length()-1;i>=0;i--)
		{
			b = b+st.charAt(i);
		}
		if(st.equals(b))
			return true;
		else
			return false;
	}
	 
	public static void main(String[] args) 
	{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String:");
          String st = sc.nextLine();
//          boolean rs = isPalindrome(st);
//          if(rs)
//        	  System.out.println("String is Palindrome");
//          else
//        	  System.out.println("String is not Palindrome");
//          boolean rs1 = isPalin(st);
//          if(rs1)
//        	  System.out.println("String is Palindrome");
//          else
//        	  System.out.println("String is not Palindrome");
          boolean rs2 = isPali(st);
          if(rs2)
        	  System.out.println("String is Palindrome");
          else
        	  System.out.println("String is not Palindrome");
	}
}
