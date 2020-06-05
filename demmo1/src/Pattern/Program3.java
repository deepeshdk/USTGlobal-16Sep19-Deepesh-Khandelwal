package Pattern;

public class Program3 {

	public static void main(String[] args) {
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========");
		for(int i=1;i<=n;i++) {
			int k = 1;
			for(int j=1;j<=2*i-1;j++) {
				if(j%2 == 0)
					System.out.print("*");
				else
					System.out.print(k++);
			}
			System.out.println();
		}
		System.out.println("========");
		for(int i=1;i<=n;i++) {
			int k = n;
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==0) {
				System.out.print("*");
			} else {
				System.out.print(k--);
			}
		}
			System.out.println();
	 }
		System.out.println("=========");
		for(int i=1;i<=n;i++) {
			int k = i;
			for(int j=1;j<=2*i-1;j++) {
				if(j%2 == 0) {
					System.out.print("*");
				} else
						System.out.print(k++);
				}
			System.out.println();
			}
		System.out.println("=========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i-1;j++) {
				if(j%2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		}
  }

