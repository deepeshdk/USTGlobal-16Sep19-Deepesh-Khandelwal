//String is Panagram or not
package StringPrograms;
import java.util.Scanner;
public class String4
{
	static boolean isPanagram(String st) 
	{
	    if(st.length()<26)	
		return false;
	    int count[] = new int[26];
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
						return false;
				}
	    return true;
	}
public static void main(String[] args)
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String : ");
      String st = sc.nextLine();
       boolean rs = isPanagram(st);
       if(rs)
    	   System.out.println("String is Panagram");
       else
    	   System.out.println("String is not Panagram");
	}


}
