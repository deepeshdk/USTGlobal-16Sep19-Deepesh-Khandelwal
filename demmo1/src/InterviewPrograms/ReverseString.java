package InterviewPrograms;
import java.util.Scanner;
public class ReverseString 
{
public static void main(String[] args) 
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the String to be Reversed");
   String st = sc.nextLine();
   
   StringBuilder str = new StringBuilder();
         str.append(st);
         str  = str.reverse();
         System.out.println("Reverse String is : "+str);
	}

}
