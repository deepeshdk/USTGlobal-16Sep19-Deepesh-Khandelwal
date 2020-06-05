package InterviewPrograms;
import java.util.Scanner;
public class ReverseString1 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String to be Reversed");
	   String st = sc.nextLine();
	   String rs = " ";
	   char ch[] = st.toCharArray();
	   for(int i=ch.length-1;i>=0;i--)
	   {
        //System.out.print(ch[i]);
		   rs = rs+ch[i];//for storing result in new String
	   }
	   System.out.println(rs);
	}

}
