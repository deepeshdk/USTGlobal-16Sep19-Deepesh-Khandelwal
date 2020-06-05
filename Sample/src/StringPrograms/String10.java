//Swap Every word first and last character
package StringPrograms;
import java.util.Scanner;
public class String10 
{
	static String swapFirstToLast(String st)
	{
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(i==0 && ch[i]!= 32 || ch[i]!=32 && ch[i-1]==32)
			{
				int t=i;
				while(i<ch.length && ch[i]!=32)
				{
					i++;
			    }
			char temp = ch[t];
			ch[t] = ch[i-1];
			ch[i-1] = temp;
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
		String rs = swapFirstToLast(s1);
		System.out.println("Swaped String is : "+rs);
  }
}