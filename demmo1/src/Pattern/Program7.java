package Pattern;

public class Program7 {

	public static void main(String[] args) {

		int n = 5;
		for(int i=1;i<=n;i++) {
			System.out.println("*****");
		}
		System.out.println("-----or-----");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------");
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------");
		int k = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		System.out.println("-------");
		int st = 1;
		int sp = n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
			}
			if(i <= n/2) {
				st = st+2;
				sp--;
			} else {
				st = st-2;
				sp++;
			}
			System.out.println();
		}
		System.out.println("------------");
		for (int i= 1; i<= n ; i++)
        {
            for (int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            for ( k=1; k<=i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=-1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for ( k=0; k<=n-2-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
		System.out.println("==========");
	}

}
