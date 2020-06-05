package InterviewPrograms;

import java.util.Scanner;

public class OccurenceOfVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int vc = 0;
		for(int i = 0;i < s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch >= 65 && ch <= 90) {
				if(ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
					vc++;
				}
			}
			if(ch >= 97 && ch <= 122) {
				if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {
					vc++;
				}
			}
		}
		System.out.println("Number of vowels : "+vc);
	}
}
