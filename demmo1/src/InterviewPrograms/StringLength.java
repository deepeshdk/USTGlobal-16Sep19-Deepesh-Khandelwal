package InterviewPrograms;
import java.util.Scanner;
public class StringLength
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the String:");
      String s  = sc.nextLine();
      char ch[] = s.toCharArray();
      int i = 0;
     for(char c : ch)
      {
    	  i++;
      }
      System.out.println("Length of a String is :"+i);
      System.out.println("---------------------");
        int length = 0;
        try
      {
      for(i=0;ch[i]!='\0';i++)
      {
    	  length++;
      }
     }
        catch(Exception e)
        {
        System.out.println("Length of a String is :"+length);
	    }
	}

}
