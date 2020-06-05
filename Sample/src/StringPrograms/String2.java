//count each character present in the string
package StringPrograms;
import java.util.Scanner;
public class String2 
{
public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String st = sc.nextLine();
    int count[]= new int[128];
      for (int i = 0; i < st.length(); i++) 
      {
		char ch = st.charAt(i);
		count[ch]++;
	}
         for (int j = 0; j < count.length; j++) 
         {
			if(count[j]!=0)
				System.out.println((char)j+"--->"+count[j]);
		}
	}

}
