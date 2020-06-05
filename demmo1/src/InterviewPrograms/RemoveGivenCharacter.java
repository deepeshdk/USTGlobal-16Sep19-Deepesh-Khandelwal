package InterviewPrograms;
import java.util.Scanner;
public class RemoveGivenCharacter 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String s = sc.nextLine();
      System.out.println("Enter the Character :");
      char ch = sc.next().charAt(0);
      char ch1[] = s.toCharArray();
      int count=0;int j=0;
      for (int i= 0; i < ch1.length; i++) 
        {
			if(ch1[i]!=ch)
			{
				ch1[j++]=ch1[i];
			}
			else
				count++;
		}
		while(count>0)
		{
			ch1[j++]='\0';
			count--;
		}
	
		System.out.println(ch1);
	}
}
