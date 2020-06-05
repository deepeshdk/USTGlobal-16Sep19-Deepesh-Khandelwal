package Pattern;

public class Program5 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		System.out.println("=======");
		int k = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(k%2);
				k++;
			}
			System.out.println();
		}
		System.out.println("=========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		System.out.println("----------");
		k = 1;
		n = 6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(k+64));
				k++;
				if(k == 27)
					k = 1;
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		System.out.println("=========");
		n = 9;
		int st = n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print("*");
			}
			if(i <= n/2)
				st--;
			else
				st++;
			System.out.println();
		}
		System.out.println("==========");
	}
}
