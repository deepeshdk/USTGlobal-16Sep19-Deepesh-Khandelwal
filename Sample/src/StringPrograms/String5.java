//String is Anagram or not
package StringPrograms;

import java.util.Scanner;

public class String5 
{
	static boolean isAnagram(String s1,String s2)
	{
		int c1[] = new int[26];
		int c2[] = new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>=65&&ch<=90)
			{
				c1[ch-65]++;
			}
				else if(ch>=97&&ch<=122)
				{
					c1[ch-97]++;
				}
			}
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(ch>=65&&ch<=90)
			{
				c2[ch-65]++;
			}
				else if(ch>=97&&ch<=122)
				{
					c2[ch-97]++;
				}
			}
		for (int i = 0; i < c1.length; i++)
		{
		   if(c1[i]!=c2[i])	
			   return false;
		}
		return true;
		}
		
public static void main(String[] args) 
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the First String : ");
  String s1 = sc.next();
  System.out.println("Enter the Second String : ");
  String s2 = sc.next();
  boolean rs = isAnagram(s1,s2);
  if(rs)
	   System.out.println("String is Anagram");
  else
	   System.out.println("String is not Anagram");
	}

}
