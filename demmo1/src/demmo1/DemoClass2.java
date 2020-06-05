package demmo1;

public class DemoClass2 {

	static String revSen(String s) {
		String rs = "";
		char ch[] = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int j = i+1;
			while(j<=k) {
				rs = rs+ch[j];
				j++;
			}
			if(i>=0) {
				rs = rs+ch[i];
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		
		String s = "Deepesh Kumar Khandelwal";
		String rev = revSen(s);
		System.out.println("Reverse is "+rev);
	}

}
