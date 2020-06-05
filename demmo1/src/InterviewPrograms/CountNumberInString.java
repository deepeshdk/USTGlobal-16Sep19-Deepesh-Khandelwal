package InterviewPrograms;

import java.util.Scanner;
public class CountNumberInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
       String s = sc.next();
       char ch[] = s.toCharArray();
       int count=0;
       for (int i = 0; i < ch.length; i++) 
       {
		if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'
		||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
		{
			count++;
		}
       }
		System.out.println(count);
		System.out.println("------------");
		count=0;
		for (int i = 0; i < ch.length; i++) 
	       {
		if(ch[i]>='0'&&ch[i]<='9')
		{
			count++;
		}
	   }
       System.out.println(count);
	}

}
