package demmo1;

public class DemoClass {

	public static void main(String[] args) {

		String s = "Deepesh Kumar Khandelwal";
		int count[] = new int[128]; 
		for(int i=0;i<s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				count[ch-65]++;
			}
			else if(ch >='a' && ch <= 'z') {
				count[ch-97]++;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
			System.out.println((char)(i+65) + " Count of Character are : "+count[i]);
			}
		}
		System.out.println("Total count is : "+s.length());
		System.out.println("------------");
		
		String s1 = "Deepesh";
		String s2 = "ee";
		
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		int count1 = 0;
		for(int i=0;i<ch.length;i++) {
			int k=i; int j = 0;
			while(j < ch1.length && k < ch.length && ch[k]==ch1[j]) {
				k++;
				j++;
			}
			if(j == ch1.length) {
				count1++;
				i = k-1;
			}
		}
		System.out.println(count1);
		
	}

}
