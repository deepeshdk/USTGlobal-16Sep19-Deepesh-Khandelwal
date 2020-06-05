package demmo1;

public class DemoClass1 {
	static String revSen(String s) {
		char[] ch = s.toCharArray();
		String rs = "";
		for(int i=0;i<ch.length;i++) {
			int k=i;
			while(i < ch.length && ch[i]!=' ') {
				i++;
			}
			int j = i-1;
			while(j>=k) {
				rs = rs+ch[j];
				j--;
			}
			if(i<ch.length) {
				rs = rs+ch[i];
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		String s = "Deepesh Kumar Khandelwal";
		
		String rev = revSen(s);
		System.out.println("Reverse is " + rev);
		
	}
}
