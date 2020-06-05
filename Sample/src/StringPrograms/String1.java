//count vowels,consonants,special characters,digits,uppercase,lowercase
//character present in a string
package StringPrograms;
import java.util.Scanner;
public class String1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thr String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int uc=0,lc=0,vc=0,cc=0,dc=0,spc=0;
		for (int i = 0; i < st.length(); i++) 
		{
		char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
				vc++;
			else
				cc++;
			}
			else if(ch>='a'&ch<='z')
			{
				lc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			
				vc++;
			else
				cc++;
			}
			else if(ch>='0'&&ch<='9')
			{
				dc++;
			}
			else
				spc++;
		}
		System.out.println("Number of Vowels are : "+vc);
		System.out.println("Number of Consonants are : "+cc);
		System.out.println("Number of UpperCase Characters are : "+uc);
		System.out.println("Number of LowerCase Characters are : "+lc);
		System.out.println("Number of Special Characters are : "+spc);
		System.out.println("Number of Digits are : "+dc);
}

}
