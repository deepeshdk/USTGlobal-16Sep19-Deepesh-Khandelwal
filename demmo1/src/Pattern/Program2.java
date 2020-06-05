package Pattern;

public class Program2 {

	public static void main(String[] args) {

		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("======");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		System.out.println("=========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		System.out.println("=======");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		System.out.println("========");
		int k = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++ + " ");
				if(k == 10) {
					k = 1;
				}
			}
			System.out.println();
		}
		System.out.println("=======");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k%2 + " ");
				k++;
			}
			System.out.println();
		}
		System.out.println("======");
		 k = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k%2 + " ");
				k++;
			}
			System.out.println();
		}
	}

}
