//count number of occurrence of each alphabet present in the string
package StringPrograms;
import java.util.Scanner;
public class String3 
{
public static void main(String[] args) 
	{
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the  String : ");
       String st  = sc.nextLine();
       int count [] = new int[26];
       for (int i = 0; i < st.length(); i++) 
       {
    	   char ch = st.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			count[ch-65]++;
		}
		else if(ch>='a'&&ch<='z')
		{
			count[ch-97]++;
		}
	}
       for (int j = 0; j < count.length; j++) 
       {
		if(count[j]!=0)
			System.out.println((char)(j+65)+"---->"+count[j]);
	   }
      }
}