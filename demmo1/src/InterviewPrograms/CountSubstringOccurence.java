package InterviewPrograms;
import java.util.Scanner;
public class CountSubstringOccurence 
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String :");
      String s = sc.nextLine();
      System.out.println("Enter the Sub-String :");
      String s1 = sc.next();
      char ch[] = s.toCharArray();
      char ch1[] = s1.toCharArray();
      int count = 0;
      for (int i = 0; i < ch.length; i++)
      {
    	  int k = i; int j=0;
			while(j < ch1.length && k < ch.length && ch[k]==ch1[j])
			{
				k++;
				j++;
			}
		if(j==ch1.length)
		{
		   count++;
		   i = k-1;
		}
	  }
      System.out.println("SubString count is :"+count);
	}

}
