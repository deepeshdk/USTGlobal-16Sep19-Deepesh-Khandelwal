//program to convert String of number into Number(Integer)
package StringPrograms;
import java.util.Scanner;
public class String6 
{
	static int convertToInt(String st)
	{
		int sum=0;
     for (int i = 0; i < st.length(); i++) 
     {
		char ch = st.charAt(i);
		sum = sum*10+(ch-48);
	}		

		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.next();
		sc.close();
		int rs = convertToInt(s1);
		System.out.println("Converted String Into int is : "+rs);
	}

}
